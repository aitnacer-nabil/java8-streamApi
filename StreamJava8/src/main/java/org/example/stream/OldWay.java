package org.example.stream;

import org.example.MockData;
import org.example.data.Person;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OldWay {
    public static void main(String[] args) throws IOException {
        //oldWay();
        newWay();
    }

    private static void newWay() throws IOException {
        List<Person> personList = MockData.getPeoples();
        //find people less or equal  18 years old
        //then select first  10 people
        List<Person> youngPerson = personList.stream()
                .filter(person-> person.getAge() <= 18)
                .limit(10)
                .collect(Collectors.toList());

        youngPerson.stream().filter(person -> person.getAge() == 10).forEach(youngPerson::remove);


    }

    private static void oldWay() throws IOException {
        List<Person> personList = MockData.getPeoples();
        //find people less or equal  18 years old
        //then select first  10 people
        List<Person> yougPeople = new ArrayList<>();
        final int limit = 10;
        int counter = 0;
        for (Person person: personList
        ) {
            if (person.getAge() <= 18){
                yougPeople.add(person);
                counter++;
                if(counter == limit){
                    break;
                }
            }
        }
        for (Person person: yougPeople
        ) {
            System.out.println(person);
        }
    }


}

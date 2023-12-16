package org.example.stream;

import org.example.MockData;
import org.example.data.Person;

import java.io.IOException;
import java.util.List;
import java.util.stream.IntStream;

public class IntStreamLecture {
    public static void main(String[] args) throws IOException {
        List<Person> personList = MockData.getPeoples();

        IntStream.range(0,personList.size()).forEach(
                index ->{
                    Person person = personList.get(index);
                    System.out.println(person);
                }
        );
        IntStream.iterate(0,operand -> operand + 1)
                .filter(number -> number % 2 == 0)
                .limit(20)
                .forEach(System.out::println);

    }
}

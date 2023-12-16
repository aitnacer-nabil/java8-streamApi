package org.example.stream;

import org.example.MockData;
import org.example.data.Car;
import org.example.data.Person;
import org.example.data.PersonDTO;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterLEcture {
    public static void main(String[] args) throws IOException {
        //filterList();
        mapTransform();

    }

    private static void filterList() throws IOException {
        List<Car> cars = MockData.getCars();

        List<Car> carsFiltred = cars.stream().
                filter(car -> car.getYear() < 2005)
                .collect(Collectors.toList());
        carsFiltred.forEach(System.out::println);
        System.out.println(carsFiltred.size());
    }

    public static void mapTransform() throws IOException {
        //transform from one data type to another
        List<Person> personList = MockData.getPeoples();
        List<PersonDTO> personDTOS = personList.stream()
                .map(person -> {

                    PersonDTO dto = new PersonDTO((int)person.getid(),person.getEmail(), person.getAge());
                    return dto;
                }).collect(Collectors.toList());
        personDTOS.forEach(System.out::println);
    }
}

package org.example.stream;

import org.example.MockData;
import org.example.data.Car;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupeByStreamLecture {
    public static void main(String[] args) throws IOException {

       grouping();

    }

    private static void grouping() throws IOException {
        Map<String, List<Car>> grouping = MockData.getCars().stream()
                .collect(Collectors.groupingBy(Car::getMake));
        grouping.forEach((make,cars)->{
            System.out.println(make);
            cars.stream().limit(3).forEach(System.out::println);
        });
    }

}

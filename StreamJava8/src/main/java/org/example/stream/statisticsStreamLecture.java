package org.example.stream;

import org.example.MockData;
import org.example.data.Car;
import org.example.data.Person;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;
import java.util.Optional;

public class statisticsStreamLecture {
    public static void main(String[] args) throws IOException {
        // count();
        // max();
       // average();
        sum();
    }
    private static void count() throws IOException {
        List<Person> personList = MockData.getPeoples();
        long countFemal = personList.stream()
                .filter(p-> p.getGender().equalsIgnoreCase("female"))
                .count();
        System.out.println(countFemal);
    }
    private static void min() throws IOException {
        List<Car> cars = MockData.getCars();
        double min = cars.stream()
                .filter(c-> c.getColor().equalsIgnoreCase("yellow"))
                .mapToDouble(Car::getPriceInt)
                .min()
                .getAsDouble();
        System.out.println(min);

    }
    private static void max() throws IOException {
        List<Car> cars = MockData.getCars();
        double max = cars.stream()
                .filter(c-> c.getColor().equalsIgnoreCase("yellow"))
                .mapToDouble(Car::getPriceInt)
                .max()
                .getAsDouble();
        System.out.println(max);
    }
    private static void average() throws IOException {
        List<Car> cars = MockData.getCars();
        double average = cars.stream()
                .mapToDouble(Car::getPriceInt)
                .average()
                .orElse(0);
        System.out.println(average);
    }
    private static void sum() throws IOException {
        List<Car> cars = MockData.getCars();
        double sum = cars.stream()
                .mapToDouble(Car::getPriceInt)
                .sum()
                ;
        System.out.println(BigDecimal.valueOf(sum));
    }
}

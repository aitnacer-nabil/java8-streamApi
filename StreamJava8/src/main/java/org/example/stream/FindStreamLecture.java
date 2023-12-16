package org.example.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FindStreamLecture {
    static final Predicate<Integer> numbersLessThan10 = n-> n > 5 && n < 10;

    public static void main(String[] args) {
        Integer[] numbersList = {1, 2, 3, 5, 6, 7, 8, 9, 10};
        int any = Arrays.stream(numbersList)
                .filter(numbersLessThan10)
                .findAny()
                .get();
        System.out.println(any);

    }
}

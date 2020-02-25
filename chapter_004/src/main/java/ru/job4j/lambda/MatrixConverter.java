package ru.job4j.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Arrays.asList;

public class MatrixConverter {
    public static List<Integer> convertToList(Integer[][] matrix) {
        return Arrays.stream(matrix).flatMap(Arrays::stream).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(convertToList(new Integer[][]{{1, 2}, {3 , 4}}));
    }
}

package ru.job4j.lambda;

import java.util.List;
import java.util.stream.Collectors;

public class MatrixConverter {
    public static List<Integer> convertToList(List<List<Integer>> matrix) {
        return matrix.stream().flatMap(List::stream).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(convertToList(List.of(List.of(1, 2), List.of(3, 4))));
    }
}

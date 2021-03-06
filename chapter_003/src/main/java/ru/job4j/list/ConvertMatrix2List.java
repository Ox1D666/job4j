package ru.job4j.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        return Stream.of(array).flatMapToInt(Arrays::stream).boxed().collect(Collectors.toList());
    }
}

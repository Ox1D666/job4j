package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class UsageArrayList {
    public static void main(String[] args) {
        List<String> names = List.of("Petr", "Petr1", "Petr2");
        names.forEach(System.out::print);
    }
}

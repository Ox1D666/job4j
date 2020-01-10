package ru.job4j.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Petr");
        names.add("Petr1");
        names.add("Petr2");
        for (String value: names) {
            System.out.println(value);
        }
    }
}

package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        Map<String, String> map = Map.of("kirill.coldline@gmail.com", "Romanov Kirill", "parsentev@yandex.ru", "Petr Arsentev");

        map.forEach((k, v) -> System.out.println(String.format("%s, %s", k, v)));

        map.forEach((k, v) -> System.out.println(String.format("%s", k)));

        map.forEach((k, v) -> System.out.println(String.format("%s", v)));
    }
}

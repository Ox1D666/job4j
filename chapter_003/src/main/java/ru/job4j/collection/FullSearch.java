package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        return list.stream().map(Task::getNumber).collect(Collectors.toCollection(HashSet::new));
    }
}

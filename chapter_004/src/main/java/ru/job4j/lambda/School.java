package ru.job4j.lambda;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class School {
    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream().filter(predict).collect(Collectors.toList());
    }
    public List<Student> levelOf(List<Student> students, int bound) {
        return students.stream().flatMap(Stream::ofNullable).sorted().takeWhile(x -> x.getScore() > bound).collect(Collectors.toList());
    }
}

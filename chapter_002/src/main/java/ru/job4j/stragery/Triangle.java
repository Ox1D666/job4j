package ru.job4j.stragery;

import java.util.StringJoiner;

public class Triangle implements Shape {
    @Override
    public String draw() {
        return new StringJoiner(
                System.lineSeparator(), "",
                System.lineSeparator())
                .add("  ^  ")
                .add(" ^ ^ ")
                .add("^^^^^")
                .toString();
    }
}

package ru.job4j.stragery;

public class Triangle implements Shape {
    @Override
    public String draw() {
        return new StringBuilder().append("  X  \n").append(" X X  \n").append("X X X").toString();
    }
}

package ru.job4j.condition;

public class MultiMax {
    public int max(int a, int b, int c) {

        int res1 = Math.max(a, b);
        return Math.max(res1,c);
    }
}

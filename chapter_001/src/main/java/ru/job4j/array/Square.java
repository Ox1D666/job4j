package ru.job4j.array;

public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        int value = 1;
        for (int i = 0; i != bound; i++) {
            rst[i] = value * value;
            value++;
        }
        return rst;
    }
}

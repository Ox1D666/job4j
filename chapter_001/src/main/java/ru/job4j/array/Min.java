package ru.job4j.array;

public class Min {
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            boolean a = array[index] < min;
            if (a) {
                min = array[index];
            }
        }
        return min;
    }
}
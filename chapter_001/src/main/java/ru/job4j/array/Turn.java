package ru.job4j.array;

public class Turn {
    public int[] back(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            array[i] = array[array.length-1];
            array[array.length-1] = temp;
        }
        return array;
    }
}

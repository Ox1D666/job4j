package ru.job4j.array;

public class Turn {

    public int[] back(int[] array) {
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            int temp = array[i];
            array[i] = array[array.length-count];
            array[array.length-count] = temp;
            count++;
            if(count > array.length/2) {
                break;
            }
        }
        return array;
    }
}

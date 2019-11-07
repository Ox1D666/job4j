package ru.job4j.array;

public class Check {
    public boolean mono(boolean[] data) {
        boolean result = false;
        int countTrue = 0;
        int countFalse = 0;
        for (int i = 0; i < data.length; i++) {
            if(data[i]==true) {
                countTrue++;
            } else if (data[i]==false) {
                countFalse++;
            }
        }
        if (countFalse == 3 | countTrue == 3) {
            result = true;
        }
        return result;
    }
}

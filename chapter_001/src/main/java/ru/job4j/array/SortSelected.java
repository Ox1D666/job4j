package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
//        int min = MinDiapason.findMin(data, 0, data.length);
//        int index = FindLoop.indexOf(data, min, 0, data.length);
        for (int i = 0; i < data.length; i++) {
            int first = data[i];
            int index = i;
            for (int j = i+1; j < data.length; j++) {
                if (data[j] < first) {
                    first = data[j];
                    index = j;
                }
            }
            int tmp = data[i];
            data[i] = first;
            data[index] = tmp;
        }
        return data;
    }
}



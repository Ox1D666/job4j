package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        while (leftIndex < left.length || rightIndex < right.length) {
            if (leftIndex == left.length) {
                rsl[leftIndex + rightIndex] = right[rightIndex++];
            } else if (rightIndex == right.length) {
                rsl[leftIndex + rightIndex] = left[leftIndex++];
            } else  {
                if(left[leftIndex] <= right[rightIndex]) {
                    rsl[leftIndex+rightIndex] = left[leftIndex++];
                } else {
                    rsl[leftIndex + rightIndex] = right[rightIndex];
                }
            }
        }
        return rsl;
    }
    public static void main(String[] args) {
        Merge process = new Merge();
        int[] rsl = process.merge(
                new int[] {1, 3, 5},
                new int[] {2, 4}
        );
        System.out.println(Arrays.toString(rsl));
    }
}
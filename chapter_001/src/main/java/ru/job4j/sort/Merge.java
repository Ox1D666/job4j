package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int i = 0;
        while (i < rsl.length) {
            if (left.length == 0) {
                System.arraycopy(right, i, rsl, i, right.length);
                break;
            } else if (right.length == 0) {
                System.arraycopy(left, i, rsl, i, left.length);
                break;
            }
            rsl[i] = left[leftIndex] < right[rightIndex] ? left[leftIndex++] : right[rightIndex++];
            if (leftIndex == left.length) {
                System.arraycopy(right, rightIndex, rsl, ++i, right.length - rightIndex);
                break;
            }
            if (rightIndex == right.length) {
                System.arraycopy(left, leftIndex, rsl, ++i, left.length - leftIndex);
                break;
            }
            i++;
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
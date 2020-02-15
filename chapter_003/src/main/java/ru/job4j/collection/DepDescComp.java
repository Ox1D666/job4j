package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int result = 0;
        int length = Math.min(o1.length(), o2.length());
        for (int i = 0; i < length; i++) {
            if (o1.charAt(i) > o2.charAt(i)) {
                result = -1;
            }
        }
        if (result == 0) {
            result  = o1.length() - o2.length();
        }
        return result;
    }
}
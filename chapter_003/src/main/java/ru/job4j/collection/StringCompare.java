package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int rsl = 0;
        int length = Math.min(o1.length(), o2.length());
        for (int i = 0; i < length; i++) {
            char first = o1.charAt(i);
            char second = o2.charAt(i);
            if (first != second) {
                rsl = Character.compare(first, second);
                break;
            }
        }
        if (rsl == 0) {
            rsl = o1.length() - o2.length();
        }
        return rsl;
    }
}

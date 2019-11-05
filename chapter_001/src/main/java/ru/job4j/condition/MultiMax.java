package ru.job4j.condition;

public class MultiMax {
    public int max(int a, int b, int c) {

//        if (a >= b & a >= c) {
//            res = a;
//        } else if (b >= a & b >= c) {
//            res = b;
//        } else
//            res = c;
//        return res;

        boolean con1 = a > b;
        int res1 = con1 ? a : b;
        boolean con2 = res1 > c;
        int res2 = con2 ? res1 : c;
        return res2;
    }
}

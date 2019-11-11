package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double sqrt = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        return sqrt;
    }

    public static void main(String[] args) {
        double result = distance(1, 2, 3, 4);
        System.out.println("result (1, 2) to (3, 4) " + result);
        double result2 = distance(19, 4, 63, 14);
        System.out.println("result (19, 4) to (63, 14) " + result2);
    }
}

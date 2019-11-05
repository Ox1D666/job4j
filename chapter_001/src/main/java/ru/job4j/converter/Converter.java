package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble (int value) {
        return value * 60;
    }

    public static boolean test (int expected, int out) {
        boolean passed = expected == out;
        return passed;
    }


    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);

        int in2 = 120;
        int expected2 = 2;
        int out2 = rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("120 rubles are 2. Test result : " + passed2);

        int in3 = 50;
        boolean test = test(3500,euroToRuble(in3));
        System.out.println("50 euro are 3500. Test result : " + test);

        int in4 = 50;
        boolean test1 = test(3000,dollarToRuble(in4));
        System.out.println("50 dollar are 3000. Test result : " + test1);
    }
}

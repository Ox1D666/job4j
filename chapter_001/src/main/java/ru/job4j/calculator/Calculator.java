package ru.job4j.calculator;

/**
 * Класс осуществляющий арифметические опреации.
 * @author Admin
 * @since 5.11.2019
 * @version1
 */

public class Calculator {
    /**
     * Метод выполняющий сложение двух чисел.
     * @param first - первое число.
     * @param  second - второе число.
     */
    public static void add(double first, double second) {
        double result =  first + second;
        System.out.println(first + "+" + second + " = " + result);
    }
    /**
     * Метод выполняющий деление двух чисел.
     * @param first - первое число.
     * @param  second - второе число.
     */
    public static void div(double first, double second) {
        double result =  first / second;
        System.out.println(first + "+" + second + " = " + result);
    }
    /**
     * Метод выполняющий умножение двух чисел.
     * @param first - первое число.
     * @param  second - второе число.
     */
    public static void multiple(double first, double second) {
        double result =  first * second;
        System.out.println(first + "+" + second + " = " + result);
    }
    /**
     * Метод выполняющий вычитание одного числа из другого.
     * @param first - первое число.
     * @param  second - второе число.
     */
    public static void subtrack(double first, double second) {
        double result =  first - second;
        System.out.println(first + "+" + second + " = " + result);
    }

    /**
     * Передача значений параметров в методы выполняющие арифметические операции.
     * @param args
     */

    public static void main(String[] args) {
        add(1, 1);
        div(4, 2);
        multiple(2, 1);
        subtrack(10, 5);
    }
}

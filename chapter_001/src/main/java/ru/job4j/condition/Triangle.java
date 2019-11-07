package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        boolean result;
        if(ab+ac > bc && ac+bc > ab && ab+bc > ac) {
            result = true;
        } else
        result = false;
        return result;
    }
}

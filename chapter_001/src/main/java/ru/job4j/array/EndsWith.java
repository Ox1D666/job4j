package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = false;
        int countEnd = 1;
        int countEnd2 = 1;
        int countCell = 0;
        boolean cicle = true;
        while (cicle) {
            char a = word[word.length-countEnd];
            countEnd++;
            for (int i = 0; i < 1; i++) {
                boolean x = post[post.length-countEnd2] == a;
                countEnd2++;
                if (x == true) {
                    countCell++;
                }
                if (countCell == 2 | x == false) {
                    cicle = false;
                }
            }
        }
        if (countCell == 2) {
            result = true;
        }
        return result;
    }
}

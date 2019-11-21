package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean run = true;
        int count = 11;
        System.out.println("Игра 11. Каждый Игрок берёт от 1 до 3 спичек. Выигрывает тот, кто забирает последние.");
        while (run) {
            System.out.println("Ход первого игрока:");
            int select1 = Integer.valueOf(sc.nextLine());
            if (select1 == 1 | select1 == 2 | select1 == 3) {
                count = count - select1;
                System.out.println(count);
            } else System.out.println("Введите 1, 2 или 3.");
            System.out.println("Ход второго игрока:");
            int select2 = Integer.valueOf(sc.nextLine());
            if (select2 == 1 | select2 == 2 | select2 == 3) {
                count = count - select2;
                System.out.println(count);
            } else System.out.println("Введите 1, 2 или 3.");
            if (count <= 0) {
                run = false;
            }
        }
    }
}

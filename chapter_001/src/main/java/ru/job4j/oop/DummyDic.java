package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String string = "Неизвестное слово: " + eng;
        return string;
    }

    public static void main(String[] args) {
        DummyDic dummyDic = new DummyDic();
        String phrase = dummyDic.engToRus("java");
        System.out.println("Dummy dic says: " + phrase);
    }
}

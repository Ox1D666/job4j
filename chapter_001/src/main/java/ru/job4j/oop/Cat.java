package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println("Кота зовут " + this.name + ". " + "Он ест " + this.food + ".");
    }
    public void eat(String meat) {
        this.food = meat;
    }
    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("Котёнок Гав");
        gav.show();
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("Чёрный кот");
        black.show();
    }
}

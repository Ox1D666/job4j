package ru.job4j.profession;

public class Doctor extends Profession {
    private String humanity;
    Human human = new Human();


    public String getHumanity() {
        return humanity;
    }

    private Human heal() {
        System.out.println("Лечу людей");
        return human;
    }
}

package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("Vasya");
        student1.setDateEntrance("01.09.2019");
        student1.setGroup("LD-212");

        System.out.println(student1.getName() + ", "
                + student1.getDateEntrance() + ", "
        + student1.getGroup());
    }
}

package ru.job4j.test;

public class Employee {
    String name;
    String department;
    int salary;

    public Employee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "name = " + name + '\'' + ", department = " + department + '\'' + ", salary = " + salary;
    }

    public static void main(String[] args) {
        int b = Integer.parseInt("10",16);
        int c = Integer.parseInt("32",16);
        System.out.println(b + " " + c);
    }
}

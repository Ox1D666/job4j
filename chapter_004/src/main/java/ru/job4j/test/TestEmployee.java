package ru.job4j.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

class TestEmployee {

    void workerSort(List<Employee> workers, Predicate<Employee> t) {
        for (Employee el: workers) {
            if (t.test(el)) {
                System.out.println(el);
            }
        }
    }

    public static void main(String[] args) {
        TestEmployee te = new TestEmployee();
        List<Employee> workers = Arrays.asList(new Employee("Anna", "IT", 200),
                new Employee("Kirill", "IT", 450),
                new Employee("Evgeniy", "HR", 300),
                new Employee("Eva", "HR", 450),
                new Employee("SRE", "SRE", 228));

        te.workerSort(workers, x -> x.department.equals("IT") && x.salary > 200);
        te.workerSort(workers, x -> x.name.startsWith("E") && x.salary != 450);
        te.workerSort(workers, x -> x.name.equals(x.department));
    }
}

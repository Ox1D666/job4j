package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }
    /**
     * Вернуть список всех пользователей у которых есть key в любых полях.
     * @param key совпадения с которым ищем
     * @return список подошедших пользователей
     */
    public ArrayList<Person> find(String key) {
        Predicate<Person> combine = person -> person.getName().contains(key)
                || person.getSurname().contains(key)
                || person.getPhone().contains(key)
                || person.getAddress().contains(key);
        ArrayList<Person> result = new ArrayList<>();
        for (var person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}

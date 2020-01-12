package ru.job4j.search;

import java.util.ArrayList;

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
        ArrayList<Person> rsl = new ArrayList<>();
        for (Person value: this.persons) {
            if (value.getName().contains(key)
                    || value.getSurname().contains(key)
                    || value.getPhone().contains(key)
                    || value.getAddress().contains(key)) {
                rsl.add(value);
            }
        }
        return rsl;
    }
}

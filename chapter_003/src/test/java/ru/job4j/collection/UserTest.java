package ru.job4j.collection;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void whenAsc() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Petr", 32));
        users.add(new User("Ivan", 31));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("Ivan", 31)));
        assertThat(it.next(), is(new User("Petr", 32)));
    }

    @Test
    public void whenComparePertVSIvan() {
        int rsl = new User("Petr", 32).compareTo(new User("Ivan", 31));
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void whenCompareByNameUp() {
        Comparator<User> users = new UserDescByName();
        int rsl = users.compare(new User("Fix bug", 1), new User("Hix bug", 4));
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenCompareByNameDown() {
        Comparator<User> users = new UserDescByName();
        int rsl = users.compare(new User("Hix bug", 1), new User("Fix bug", 4));
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void whenCompareByAgeUp() {
        Comparator<User> users = new UserDescByAge();
        int rsl = users.compare(new User("Hix bug", 1), new User("Fix bug", 4));
        assertThat(rsl, lessThan(0));
    }
    @Test
    public void whenCompareByAgeDown() {
        Comparator<User> users = new UserDescByAge();
        int rsl = users.compare(new User("Hix bug", 4), new User("Fix bug", 1));
        assertThat(rsl, greaterThan(0));
    }
    @Test
    public void whenCompatorByNameAndAge() {
        Comparator<User> users = new UserDescByName().thenComparing(new UserDescByAge());
        int rsl = users.compare(new User("Fix bug", 1), new User("Fix bug", 4));
        assertThat(rsl, lessThan(0));
    }
}
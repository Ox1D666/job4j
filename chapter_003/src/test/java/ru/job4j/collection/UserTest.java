package ru.job4j.collection;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void whenAsc() {
        Iterator<User> it = Set.of(new User("Petr", 32), new User("Ivan", 31)).
                stream().sorted().collect(Collectors.toCollection(TreeSet::new)).
                iterator();
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
        assertThat(users.compare(new User("Fix bug", 1), new User("Hix bug", 4)), lessThan(0));
    }
    @Test
    public void whenCompareByNameDown() {
        Comparator<User> users = new UserDescByName();
        assertThat(users.compare(new User("Hix bug", 1), new User("Fix bug", 4)), greaterThan(0));
    }
    @Test
    public void whenCompareByAgeUp() {
        Comparator<User> users = new UserDescByAge();
        assertThat(users.compare(new User("Hix bug", 1), new User("Fix bug", 4)), lessThan(0));
    }
    @Test
    public void whenCompareByAgeDown() {
        Comparator<User> users = new UserDescByAge();
        assertThat(users.compare(new User("Hix bug", 4), new User("Fix bug", 1)), greaterThan(0));
    }
    @Test
    public void whenCompatorByNameAndAge() {
        Comparator<User> users = new UserDescByName().thenComparing(new UserDescByAge());
        assertThat(users.compare(new User("Fix bug", 1), new User("Fix bug", 4)), lessThan(0));
    }
}
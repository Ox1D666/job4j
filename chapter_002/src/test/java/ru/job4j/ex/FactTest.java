package ru.job4j.ex;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenNLessThenOne() {
        Fact fact = new Fact();
        fact.calc(-1);
    }
}

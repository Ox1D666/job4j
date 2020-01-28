package ru.job4j.stragery;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import ru.job4j.stragery.Square;
import ru.job4j.stragery.Triangle;

import java.util.StringJoiner;

public class DrawTest {
    @Test
    public void whenDrawSquare() {
        Square sq = new Square();
        assertThat(sq.draw(), is(new StringBuilder().append("+++\n").append("+ +\n").append("+++").toString()));
    }
    @Test
    public void whenDrawTriangle() {
        assertThat(new Triangle().draw(), is(new StringJoiner(
                System.lineSeparator(), "",
                System.lineSeparator())
                .add("  ^  ")
                .add(" ^ ^ ")
                .add("^^^^^")
                .toString()));
    }
}

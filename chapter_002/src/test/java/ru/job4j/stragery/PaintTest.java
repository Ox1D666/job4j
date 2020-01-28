package ru.job4j.stragery;

import org.junit.Test;
import ru.job4j.stragery.Paint;
import ru.job4j.stragery.Square;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.job4j.stragery.Triangle;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
    // поле содержит дефолтный вывод в консоль.
    private final PrintStream stdout = System.out;
    // буфер для результата.
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

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

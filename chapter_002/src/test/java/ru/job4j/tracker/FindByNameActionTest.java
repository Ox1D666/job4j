package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindByNameActionTest {
    @Test
    public void whenCheckOutput() {
//        ByteArrayOutputStream out = new ByteArrayOutputStream();
//        PrintStream def = System.out;
//        System.setOut(new PrintStream(out));
//        Tracker tracker = new Tracker();
//        Item item = new Item("fix bug", "01.01.2019.");
//        tracker.add(item);
//        String[] answers = {item.getName()};
//        Input input = new StubInput(answers);
//        FindByName act = new FindByName(6,"Name: %s| Desc: %s| Id: %s");
//        act.execute(input, tracker);
//        String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
//                .add(item.getId() + " " + item.getName())
//                .toString();
//        assertThat(new String(out.toByteArray()), is(expect));
//        System.setOut(def);
    }
}

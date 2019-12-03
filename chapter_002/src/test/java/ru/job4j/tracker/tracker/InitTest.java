package ru.job4j.tracker.tracker;

import org.junit.Test;
import ru.job4j.tracker.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class InitTest {
    @Test
    public void whenExit() {
        StubInput input = new StubInput(new String[] {"0"});
        StubAction action = new StubAction();
        new StartUI().init(input, new Tracker(), new UserAction[] {action});
        assertThat(action.isCall(), is(true));
    }
}

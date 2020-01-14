package ru.job4j.sort;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MachineTest {
    @Test
    public void whenEquals() {
        Machine machine = new Machine();
        int[] expect = {};
        int[] rsl = machine.change(100, 100);
        assertThat(rsl, is (expect));
    }
    @Test
    public void when50By35() {
        Machine machine = new Machine();
        int[] expect = {10, 5};
        int[] rsl = machine.change(50, 35);
        assertThat(rsl, is (expect));
    }
    @Test
    public void when50By10() {
        Machine machine = new Machine();
        int[] expect = {10, 10, 10, 10};
        int[] rsl = machine.change(50, 10);
        assertThat(rsl, is (expect));
    }
    @Test
    public void when50By32() {
        Machine machine = new Machine();
        int[] expect = {10, 5, 2, 1};
        int[] rsl = machine.change(50, 32);
        assertThat(rsl, is (expect));
    }
}

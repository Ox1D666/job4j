package ru.job4j.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ConvertListTest {
    @Test
    public void whenTwoList() {
        assertThat(ConvertList.convert(List.of(new int[] {1}, new int[] {2, 3})),
                is(List.of(1, 2, 3)));
    }
}
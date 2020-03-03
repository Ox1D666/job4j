package ru.job4j.list;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertMatrix2ListTest {
    @Test
    public void when2On2ArrayThenListe4() {
        assertThat(new ConvertMatrix2List().toList(new int[][] {{1, 2}, {3, 4}}),
                is(List.of(1, 2, 3, 4)));
    }
}

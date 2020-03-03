package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FullSearchTest {

    @Test
    public void extractNumber() {
        assertThat(FullSearch.extractNumber(
                List.of(new Task("1", "First desc"),
                        new Task("2", "Second desc"),
                        new Task("1", "First desc"))),
                is(
                        Set.of("1", "2")));
    }
}

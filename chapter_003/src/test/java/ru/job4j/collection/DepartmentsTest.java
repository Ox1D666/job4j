package ru.job4j.collection;

import org.junit.Test;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {
    @Test
    public void whenMissed() {
        assertThat(Departments.fillGaps(
                List.of("K1/SK1",
                "K1/SK2",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K2",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2")),
                is(
                        List.of("K1",
                        "K1/SK1",
                        "K1/SK1/SSK1",
                        "K1/SK1/SSK2",
                        "K1/SK2",
                        "K2",
                        "K2/SK1",
                        "K2/SK1/SSK1",
                        "K2/SK1/SSK2")));
    }

    @Test
    public void whenNonChange() {
        assertThat(Departments.fillGaps(
                List.of("K1",
                "K1/SK1",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K1/SK2",
                "K2",
                "K2/SK1",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2")),
                is(
                        List.of("K1",
                        "K1/SK1",
                        "K1/SK1/SSK1",
                        "K1/SK1/SSK2",
                        "K1/SK2",
                        "K2",
                        "K2/SK1",
                        "K2/SK1/SSK1",
                        "K2/SK1/SSK2")));
    }
    @Test
    public void revertSort() {
        List<String> input = Arrays.asList("K1",
                "K1/SK1",
                "K1/SK1/SSK1",
                "K1/SK1/SSK2",
                "K1/SK2",
                "K2",
                "K2/SK1",
                "K2/SK1/SSK1",
                "K2/SK1/SSK2");
        List<String> expect = Arrays.asList("K2",
                "K2/SK1",
                "K2/SK1/SSK2",
                "K2/SK1/SSK1",
                "K1",
                "K1/SK2",
                "K1/SK1",
                "K1/SK1/SSK2",
                "K1/SK1/SSK1");
        Departments.sortDesc(input);
        assertThat(input, is(expect));
    }
}
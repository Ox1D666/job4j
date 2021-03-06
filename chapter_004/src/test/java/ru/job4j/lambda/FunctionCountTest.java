package ru.job4j.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

public class FunctionCountTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = FunctionCount.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }
    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        List<Double> result = FunctionCount.diapason(5, 8, x -> Math.pow(x, 2) + 2 * x + 3);
        List<Double> expected = Arrays.asList(38D, 51D, 66D);
        assertThat(result, is(expected));
    }
    @Test
    public void whenLogFunctionThenLogResults() {
        List<Double> input = FunctionCount.diapason(5, 8, Math::log);
        List<Double> result = input.stream().map(x -> Math.floor(x * Math.pow(10, 3)) / Math.pow(10, 3)).collect(Collectors.toList());
        List<Double> expected = Arrays.asList(1.609, 1.791, 1.945);
        assertThat(result, is(expected));
    }
}

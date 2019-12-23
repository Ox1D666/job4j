package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        Point ap = new Point(1, 1);
        Point bp = new Point(3, 4);
        Point cp = new Point(5, 1);
        Triangle triangle = new Triangle(ap, bp, cp);
        double expect = triangle.area();
        assertThat(expect, is(5.9999999999998));
    }
}

package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TriangleTest {
    @Test
    public void whenExist() {
        Point ap = new Point(1, 1);
        Point bp = new Point(3, 4);
        Point cp = new Point(5, 1);
        Triangle triangle = new Triangle(ap, bp, cp);
        double expect = triangle.area();
        assertEquals(expect, 6.0, 0.01);
    }
}

package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

public class PointTest {
    @Test
    public void test() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2.0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void test3D() {
        Point a = new Point(0, 1, 2);
        Point b = new Point(0, 3, 2);
        double expected = 2.0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}

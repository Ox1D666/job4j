package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

public class PointTest {
    @Test
    public void test() {
        int in1 = 1;
        int in2 = 2;
        int in3 = 3;
        int in4 = 4;
        double expected = 2.82;
        double out = Point.distance(in1, in2, in3, in4);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void test2() {
        int in1 = 19;
        int in2 = 4;
        int in3 = 63;
        int in4 = 14;
        double expected = 45.12;
        double out = Point.distance(in1, in2, in3, in4);
        Assert.assertEquals(expected, out, 0.01);
    }
}

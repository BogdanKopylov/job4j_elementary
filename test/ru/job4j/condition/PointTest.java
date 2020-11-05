package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00To20Then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when46To33Then316() {
        double expected = 3.16;
        Point a = new Point(4, 6);
        Point b = new Point(3, 3);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when58To99Then412() {
        double expected = 4.12;
        Point a = new Point(5, 8);
        Point b = new Point(9, 9);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00To60Then6() {
        double expected = 6;
        Point a = new Point(0, 0);
        Point b = new Point(6, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when003To606Then6dot7() {
        double expected = 6.7;
        Point a = new Point(0, 0, 3);
        Point b = new Point(6, 0, 6);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when458To765Then4dot3() {
        double expected = 4.35;
        Point a = new Point(4, 5, 8);
        Point b = new Point(7, 6, 5);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP8K3Then3() {
        double p = 8;
        double k = 3;
        double expected = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP12K4Then576() {
        double p = 12;
        double k = 4;
        double expected = 5.76;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}
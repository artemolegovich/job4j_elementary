package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP4K1Then1() {
        int expected = 1;
        int p = 4;
        double k = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP5K1dot5Then1dot5() {
        double expected = 1.5;
        int p = 5;
        double k = 1.5;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}
package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class FactorialTest {

    @Test
    public void whenFactorialFor5Then120() {
        int expected = 120;
        int n = 5;
        int out = Factorial.calc(n);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenFactorialFor0Then1() {
        int expected = 1;
        int n = 0;
        int out = Factorial.calc(n);
        Assert.assertEquals(expected, out);
    }
}
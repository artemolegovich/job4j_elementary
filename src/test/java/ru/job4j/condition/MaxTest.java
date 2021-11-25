package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {
    @Test
    public void when1To2Then2() {
        int expected = 2;
        int left = 1;
        int right = 2;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when10To2Then10() {
        int expected = 10;
        int left = 10;
        int right = 2;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when1To1Then1() {
        int expected = 1;
        int left = 1;
        int right = 1;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }
}
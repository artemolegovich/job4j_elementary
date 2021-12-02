package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class CounterTest {

    @Test
    public void when10To22ThenSum208() {
        int expected = 208;
        int start = 10;
        int finish = 22;
        int out = Counter.sum(start, finish);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when16To19ThenSum70() {
        int expected = 70;
        int start = 16;
        int finish = 19;
        int out = Counter.sum(start, finish);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when1To50ThenSum1275() {
        int expected = 1275;
        int start = 1;
        int finish = 50;
        int out = Counter.sum(start, finish);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when1To10ThenSumByEven30() {
        int expected = 30;
        int start = 1;
        int finish = 10;
        int out = Counter.sumByEven(start, finish);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when3To8ThenSumByEven18() {
        int expected = 18;
        int start = 3;
        int finish = 8;
        int out = Counter.sumByEven(start, finish);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when0To1ThenSumByEven0() {
        int expected = 0;
        int start = 1;
        int finish = 0;
        int out = Counter.sumByEven(start, finish);
        Assert.assertEquals(expected, out);
    }
}
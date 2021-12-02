package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class CounterTest {

    @Test
    public void when10To22Then208() {
        int expected = 208;
        int start = 10;
        int finish = 22;
        int out = Counter.sum(start, finish);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when16To19Then70() {
        int expected = 70;
        int start = 16;
        int finish = 19;
        int out = Counter.sum(start, finish);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when1To50Then1275() {
        int expected = 1275;
        int start = 1;
        int finish = 50;
        int out = Counter.sum(start, finish);
        Assert.assertEquals(expected, out);
    }
}
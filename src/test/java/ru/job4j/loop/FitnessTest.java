package ru.job4j.loop;

import org.junit.Test;
import org.junit.Assert;

public class FitnessTest {

    @Test
    public void whenIvan95Nik90Then0() {
        int expected = 0;
        int ivan = 95;
        int nik = 90;
        int result = Fitness.calc(ivan, nik);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenIvan90Nik95Then1() {
        int expected = 1;
        int ivan = 90;
        int nik = 95;
        int result = Fitness.calc(ivan, nik);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenIvan50Nik90Then2() {
        int expected = 2;
        int ivan = 50;
        int nik = 90;
        int result = Fitness.calc(ivan, nik);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenIvan90Nik90Then1() {
        int expected = 1;
        int ivan = 90;
        int nik = 90;
        int result = Fitness.calc(ivan, nik);
        Assert.assertEquals(expected, result);
    }
}
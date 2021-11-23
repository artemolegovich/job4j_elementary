package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double differencePlusDivision(double first, double second) {
        return difference(first, second)
                + division(first, second);
    }

    public static double sumOfAllOperations(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + difference(first, second)
                + division(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Сумма + произведение равны: " + sumAndMultiply(10, 20));
        System.out.println("Расность + частное равны: " + differencePlusDivision(40, 20));
        System.out.println("Сумма всех операций класса MathFunction равна " + sumOfAllOperations(50, 10));
    }

}
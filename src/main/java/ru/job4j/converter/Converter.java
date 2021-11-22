package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(120);
        System.out.println("120 rubles are " + dollar + " dollars.");
        float inToEuro = 140;
        float expectedEuro = 2;
        float outEuro = Converter.rubleToEuro(inToEuro);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are 2 Euro. Test result : " + passedEuro);
        float inToDollar = 120;
        float expectedDollar = 2;
        float outDollar = Converter.rubleToDollar(inToDollar);
        boolean passedDollar = expectedDollar == outDollar;
        System.out.println("120 rubles are 2 Dollars. Test result : " + passedDollar);
    }
}

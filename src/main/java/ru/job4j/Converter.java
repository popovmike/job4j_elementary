package ru.job4j;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float dollarToEuro(float value) {
        float rsl = value * 0.8f;
        return rsl;
    }

    public static float euroToDollar(float value) {
        float rsl = value * 1.17f;
        return rsl;

    }

    public static void main(String[] args) {
        float euroRub = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euroRub + " euro.");
        float dollarRub = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollarRub + " dollars.");
        float euroDollar = Converter.dollarToEuro(10);
        System.out.println("10 dollars are " + euroDollar + " euro");
        float dollarEuro = Converter.euroToDollar(1);
        System.out.println("1 euro is " + dollarEuro + " dollars");
    }
}

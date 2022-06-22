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
        float rsl = (float) (value * 0.8);
        return rsl;
    }

    public static float euroToDollar(float value) {
        float rsl = value * 1.17f;
        return rsl;

    }

    public static void main(String[] args) {
        System.out.println("Tests: ");
        float in1 = 175;
        float expected1 = 2.5f;
        float out1 = Converter.rubleToEuro(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("175 rubles are 2.5 euro. Test result: " + passed1);
        float in2 = 240;
        float expected2 = 4;
        float out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("240 rubles are 4 dollars. Test result: " + passed2);
        float in3 = 16;
        float expected3 = 12.8f;
        float out3 = Converter.dollarToEuro(in3);
        boolean passed3 = expected3 == out3;
        System.out.println("16 dollars are 12.8 euro. Test result: " + passed3);
        float in4 = 5;
        float expected4 = 5.85f;
        float out4 = Converter.euroToDollar(in4);
        boolean passed4 = expected4 == out4;
        System.out.println("5 euro are 5.85 dollars. Test result: " + passed4);
        System.out.println("Converter: ");
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

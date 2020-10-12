package ru.job4j.ru.job4j.converter;

public class Converter {
    public static double rubleToEuro(double value) {
        return value / 70;
    }

    public static double rubleToDollar(double value) {
        return value / 60;
    }

    public static void main(String[] args) {
        double euro = Converter.rubleToEuro(140);
        double dollar = Converter.rubleToDollar(150);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("140 rubles are " + dollar + " dollars.");

        double in = 140;
        double expected = 2;
        double out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2.0. Test result : " + passed);

        double in1 = 150;
        double expected1 = 2.5;
        double out1 = Converter.rubleToDollar(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2.5. Test result : " + passed1);
    }
}

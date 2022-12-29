package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result: " + passed);
        float inTwo = 180;
        float expectedTwo = 3;
        float outTwo = Converter.rubleToDollar(inTwo);
        boolean passedTwo = expectedTwo == outTwo;
        System.out.println("120 rubles are 3. Test result: " + passedTwo);
    }
}

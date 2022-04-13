package main.java;

public class Main {

    public static void main(String[] args) {

        String testString = "test";
        int testInt = 5;
        long testLong = 1028;
        double testDouble = 5.3;
        float testFloat = 4.8f;
        boolean testBoolean = true;

        System.out.println("String name: " + testString);

        int sum = testInt + testInt;
        System.out.println(sum);

        long result = testLong - testInt;
        System.out.println(result);

        if(testDouble > testFloat && testBoolean) {
            System.out.println(++testDouble);
        } else {
            System.out.println(testFloat);
        }

        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        System.out.println(maxValue + 1);
        System.out.println(minValue - 1);

    }

}

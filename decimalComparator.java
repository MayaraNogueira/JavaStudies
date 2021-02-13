package com.company;

public class Main {

    public static void main(String[] args) {

        boolean a = areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        System.out.println("Are the numbers equal by three decimals? " + a);
        boolean b = areEqualByThreeDecimalPlaces(3.175, 3.176);
        System.out.println("Are the numbers equal by three decimals? " + b);
        boolean c = areEqualByThreeDecimalPlaces(3.0, 3.0);
        System.out.println("Are the numbers equal by three decimals? " + c);
        boolean d = areEqualByThreeDecimalPlaces(-3.123, 3.123);
        System.out.println("Are the numbers equal by three decimals? " + d);

    }

    public static boolean areEqualByThreeDecimalPlaces(double x, double y) {

        x = x * 1000;
        y = y * 1000;

        return ((int) x == (int) y);
    }
}

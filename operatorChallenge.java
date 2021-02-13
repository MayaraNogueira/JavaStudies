package com.company;

public class Main {

    public static void main(String[] args) {
        double varOne = 20.00;
        double varTwo = 80.00;
        double Result = (varOne + varTwo) * 100.00;
        System.out.println("My result is equals " + Result);
        double Remainder = (Result % 40.00);
        System.out.println("My remainder is equals " + Remainder);
        boolean isZero = (Remainder == 0);
        System.out.println("The Remainder = Zero is " + isZero);
        if (!isZero)
            System.out.println("Got some remainder.");

    }
}

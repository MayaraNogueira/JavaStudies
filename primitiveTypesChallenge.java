package com.company;

public class Main {

    public static void main(String[] args) {

        byte myByte = 105;
        short myShort = 17465;
        int myInt = 837;
        long myLong = 50000 + 10 * (myByte + myShort + myInt);
        System.out.println("O valor total é: " + myLong);

    }
}

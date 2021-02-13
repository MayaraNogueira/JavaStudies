package com.company;

public class Main {

    public static void main(String[] args) {

        boolean case01 = hasTeen(9,19,19);
        boolean case02 = hasTeen(23,15,42);
        boolean case03 = hasTeen(22,23,34);
        boolean case04 = isTeen(9);
        boolean case05 = isTeen(13);
        System.out.println(case01);
        System.out.println(case02);
        System.out.println(case03);
        System.out.println(case04);
        System.out.println(case05);
    }

    public static boolean hasTeen (int x, int y, int z) {

        return ((x  > 12 && x < 20) || (y > 12 && y < 20) || (z > 12 && z < 20));
    }

    public static boolean isTeen (int x) {

        return (x > 12 && x < 20);
    }

}
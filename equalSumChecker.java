package com.company;

public class Main {

    public static void main(String[] args) {

        boolean case01 = hasEqualSum(1,1,1);
        boolean case02 = hasEqualSum(1,1,2);
        boolean case03 = hasEqualSum(1,-1,0);
        boolean case04 = hasEqualSum(3,-4,7);
        System.out.println(case01);
        System.out.println(case02);
        System.out.println(case03);
        System.out.println(case04);
    }

    public static boolean hasEqualSum (int x, int y, int z) {
        return (x + y == z);
    }
}

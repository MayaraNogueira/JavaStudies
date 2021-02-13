package com.company;

public class Main {

    public static void main(String[] args) {

        boolean case1 = isLeapYear(-1600);
        boolean case2 = isLeapYear(1600);
        boolean case3 = isLeapYear(1800);
        boolean case4 = isLeapYear(2000);
        System.out.println("Is case 1 Leap Year? " + case1);
        System.out.println("Is case 2 Leap Year? " + case2);
        System.out.println("Is case 3 Leap Year? " + case3);
        System.out.println("Is case 4 Leap Year? " + case4);
    }

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
        }
        return false;
        }
    }
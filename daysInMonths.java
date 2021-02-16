package com.company;

/*
Write a method isLeapYear with a parameter of type int named year
The parameter needs to be greater than or equal to 1 and less than or equal to 9999
If parameter is not in range, return false
Otherwise, calculate if the year is a leap year and return true if so, otherwise, return false
A year is a leap year if it's divisible by 4 but not by 100, or divisible by 400
Then write another method getDaysInMonth with two parameters of type int, month and year.
If parameter month <1 or > 12 return -1
If parameter year < 1 or > 9999 return -1
This method need to return the numbers of days in the month. Leap years have 29 days in february.
 */

public class Main {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(9,2001));
        System.out.println(getDaysInMonth(3,2012));
        System.out.println(getDaysInMonth(1,2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));
    }

    public static boolean isLeapYear(int year) {

        if (year >= 1 && year <= 9999) {
            return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
        } return false;
    }

    public static int getDaysInMonth(int month, int year) {

        if (((month < 1) || (month > 12)) || ((year < 1) || (year > 9999))) {
            return -1;
        }
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            case 4: case 6: case 9: case 11:
                return 30;
            default:
                return -1;

        }
    }
}

/* PROFESSOR RESOLUTION

   public static boolean isLeapYear(int year){
       return year >= 1 && year <= 9999 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year){
        if(year < 1 || year > 9999) return -1;
            switch(month){
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    return 31;
                case 4: case 6: case 9: case 11:
                    return 30;
                case 2:
                    return isLeapYear(year) ? 29 : 28;
                default:
                        return -1;
        }
    }
 */
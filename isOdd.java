package com.company;

/*
Write a method called isOdd with a parameter called number.
Check if number is > 0, if not return false.
If is odd, return true, otherwise return false.
Write a second method called sumOdd with two parameters start and end, which represents a range.
Sum those numbers including the end and return the sum.
The parameter end needs to be greater than or equal to start and both start and end parameters have to be greater than 0.
If those conditions are not satisfied, return -1 to indicate invalid input.
 */


public class Main {

    public static void main(String[] args) {

        System.out.println(sumOdd(3,256));
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 1));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        else return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        if ((end < start) || (end < 0) || (start < 0)) {
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}

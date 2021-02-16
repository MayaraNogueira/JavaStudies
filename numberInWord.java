package com.company;

/*

Write a method called printNumberInWord.
The method has one parameter number which is the whole number.
The method needs to print "ZERO", "ONE", "TWO".
If the parameter number is 0, 1, 2...9, or 'other' for any other number, including negative numbers.
*/

public class Main {

    public static void main(String[] args) {

        printNumberInWord(4);
        printNumberInWord(7);
        printNumberInWord(2);
        printNumberInWord(-3);
        printNumberInWord(9);
    }

    private static void printNumberInWord(int number) {
        if ((number >= 0) && (number < 10)) {
            switch(number) {
                case 0:
                    System.out.println("ZERO");
                    break;
                case 1:
                    System.out.println("ONE");
                    break;
                case 2:
                    System.out.println("TWO");
                    break;
                case 3:
                    System.out.println("THREE");
                    break;
                case 4:
                    System.out.println("FOUR");
                    break;
                case 5:
                    System.out.println("FIVE");
                    break;
                case 6:
                    System.out.println("SIX");
                    break;
                case 7:
                    System.out.println("SEVEN");
                    break;
                case 8:
                    System.out.println("EIGHT");
                    break;
                case 9:
                    System.out.println("NINE");
                    break;
                }
        }
        else {
            System.out.println("OTHER");

        }
    }
}

package com.company;
/*
Make a while method record the total number of even numbers it has found.
Break the loop after 5 findings.
Display the total of even numbers found.
 */

public class Main {

    public static void main(String[] args) {
        int number = 2;
        int lastNumber = 80;
        int evenNumbersCount = 0;

        while(number <= lastNumber) {
            if(isEvenNumber(number)) {
                System.out.println(number + " is even.");
                evenNumbersCount ++;
                if(evenNumbersCount == 5) {
                    break;
                }
            }
            number++;
        }
        System.out.println("There was " + evenNumbersCount + " even numbers.");
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }

}

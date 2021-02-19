package com.company;

/*
Create a statement using a range of numbers from 1 to 1000 inclusive.
Sum all the numbers that can be divided both by 3 and 5.
Print those numbers.
End the loop once you find 5 numbers that meet the conditions.
Print the sum of the numbers.
 */
public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int count = 0;

        for (int i = 1; i < 1001; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println(i);
                sum += i;
                count ++;
                if (count == 5) {
                    break;
                }
            }
        }
        System.out.println("A soma é igual a " + sum);
    }
}

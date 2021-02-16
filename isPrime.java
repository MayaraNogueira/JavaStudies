package com.company;

/*
Create an statement using a range of numbers
Then create a method that determine if the number checked is prime.
If true, print out and increment a count of the number of prime numbers found
If that count is 6, exit the loop.
 */

public class Main {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count ++;
                System.out.println(i + " is a prime number.");
                if(count == 6) {
                    System.out.println("Exiting loop");
                    break;
                }
            }
        }

    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

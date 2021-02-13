package com.company;

/*The cats spend most of the day playing. In particular, tey play if the temperature is between 25 and 35 (inclusive).
Unless it's summer, then the upper limit is 45 (inclusive) instead of 35.

Exercise: Is the cat playing?

 */

public class Main {

    public static void main(String[] args) {
    System.out.println(isCatPlaying(true,10));
    System.out.println(isCatPlaying(false,36));
    System.out.println(isCatPlaying(false, 25));
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            return temperature > 24 && temperature < 46;
        }
        else {
            return temperature > 24 && temperature < 36;
        }
    }

 }

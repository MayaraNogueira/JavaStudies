package com.company;

public class Main {

    public static void main(String[] args) {

        boolean case1 = shouldWakeUp(true,1);
        boolean case2 = shouldWakeUp(false, 2);
        boolean case3 = shouldWakeUp(true, 7);
        boolean case4 = shouldWakeUp(true, -1);
        System.out.println("Should I wake up? " + case1);
        System.out.println("Should I wake up? " + case2);
        System.out.println("Should I wake up? " + case3);
        System.out.println("Should I wake up? " + case4);
    }

    public static boolean shouldWakeUp (boolean barking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }

        else return barking && hourOfDay < 8 || hourOfDay > 22;
    }

   /* COMMUNITY ANSWER

   public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        return (isBarking) && ((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay == 23));
    }*/
}




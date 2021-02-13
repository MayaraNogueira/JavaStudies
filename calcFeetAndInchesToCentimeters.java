package com.company;

public class Main {

    public static void main(String[] args) {
    calcFeetAndInchesToCentimeters(12,1);
    calcFeetAndInchesToCentimeters(-2);
    }



    public static double calcFeetAndInchesToCentimeters( double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid parameters!");
            return -1;
        }

            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println(feet + "ft and " + inches + "in in centimeters is equals to " + centimeters + "cm");
            return centimeters;
        }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid parameters!");
            return -1;
        }

        double feet = (int) inches / 12;
        double leftInches = (int) inches % 12;
        System.out.println(inches + "in is equal to " + feet + "ft and " + leftInches + "in");
        return calcFeetAndInchesToCentimeters(feet, leftInches);

    }
}


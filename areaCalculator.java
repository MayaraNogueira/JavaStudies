package com.company;

/*
Calcular área do círculo e do retângulo utilizando Method Overloading à partir de um ou dois parâmetros.
*/

public class Main {

    public static void main(String[] args) {
        area(5);
        area(-1);
        area(5,4);
        area(-1,4);
    }

        public static final double INVALID_MESSAGE = -1.0;

        public static double area (double radius) {
            if (radius < 0) {
                System.out.println(INVALID_MESSAGE);
                return INVALID_MESSAGE;
            }
            double circle = radius * radius * Math.PI;
            System.out.println("The area of this circle is " + circle);
            return circle;

        }

        public static double area (double x, double y) {
            if (x < 0 || y < 0) {
                System.out.println(INVALID_MESSAGE);
                return INVALID_MESSAGE;
            }
            double rectangle = y * x;
            System.out.println("The area of this rectangle is " + rectangle);
            return rectangle;
        }
}

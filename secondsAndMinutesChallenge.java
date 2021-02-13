package com.company;


// Create a method called getDurationString with two parameters, first parameter 'minutes'
//and second 'seconds'.
// Validate first parameter minutes >= 0
// Validate second parameter second >= 0 and < = 59
// Method should return "Invalid Value" if either are false.
// If valid, calculate how many hours, minutes and seconds equal the minutes and seconds passed to this method and
// return that value as string in 'XXh YYm ZZs' format.

//Create an overload to that method with only the parameter 'seconds'.
// Validate seconds >= 0, and return "Invalid value" if it's not true.
//If valid, calculate how many minutes are in seconds value and then cakk the other overloaded method
// passing the correct minutes and seconds calculated so that it can calculate correctly.
//Call both methods to print values to the console.

// 1h - 60 minutes = 3600 seconds
// Output should be 01h01m00s, but it's ok to be 1h 1m 0s (use if-else)


public class Main {

    /*
    MY SOLUTION

     public static void main(String[] args) {
        getDurationString(134);
     }
     public static int getDurationString (int minutes, int seconds) {
         if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
         System.out.println("Invalid Parameters!");
         return -1;
         }
         int hours = (minutes  / 60);
         int leftMinutes = (minutes % 60);
         System.out.println(minutes + "m and " + seconds + "s is equal to " +
         hours + "h " + leftMinutes + "m " + seconds + "s");
         return 1;
     }
     public static int getDurationString(int seconds) {
         if (seconds < 0) {
         System.out.println("Invalid Parameter!");
         return -1;
         }
         int minutes = (seconds / 60);
         int leftSeconds = (seconds % 60);
         System.out.println(seconds + "s is equal to " + minutes + "m and " + leftSeconds + "s.");
         return getDurationString(minutes, leftSeconds);
     }
     */

// TIM'S SOLUTION
    private static final String INVALID_VALUE_MESSAGE = "Invalid Parameters!";
        //AQUI FOI CRIADO UMA CONSTANTE PARA CHAMAR A MENSAGEM DE ERRO. "FINAL" 'TRANSFORMA' UMA VARIÁVEL EM CONSTANTE
        //(NÃO PODE SER ALTERADA).


    public static void main(String[] args) {
        System.out.println(getDurationString(-43L));
    }

    private static String getDurationString(long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
            //return "Invalid Parameters!";
            return INVALID_VALUE_MESSAGE;
        }

        long hours = minutes / 60;
        long leftMinutes = minutes % 60;

        String hoursString = hours + "h";
        if(hours < 10) {
            hoursString = "0" + hoursString;
        }
        String minutesString = leftMinutes + "m";
        if(leftMinutes < 10) {
            minutesString = "0" + minutesString;
        }
        String secondsString = seconds + "s";
        if(seconds < 10) {
            secondsString = "0" + secondsString;
        }

        return minutes + "m and " + secondsString + " is equal to " +
                hoursString + minutesString + secondsString + ".";
    }

    private static String getDurationString(long seconds) {
        if(seconds < 0) {
            //return "Invalid Parameters!";
            return  INVALID_VALUE_MESSAGE;
        }

        long minutes = seconds / 60;
        long leftSeconds = seconds % 60;
        System.out.println(seconds + "s is equal to " + minutes + "m and " + leftSeconds + "s.");
        return getDurationString(minutes, leftSeconds);
    }

}
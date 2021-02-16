package com.company;
/*
Create a new switch statement using char instead of int
Create a new variable
Create a switch statement testing for A, B, C, D or E
Display a message if any of these are found and break
Add a default which displays a message "not found"
 */


public class Main {

    public static void main(String[] args) {
        char switchValue = 'D';

        switch (switchValue) {
            /*
            case 'A':
            case 'a':
                System.out.println("Was found A");
                break;
            case 'B':
            case 'b':
                System.out.println("Was found B");
                break;
            case 'C':
            case 'c':
                System.out.println("Was found C");
                break;
            case 'D':
            case 'd':
                System.out.println("Was found D");
                break;
            case 'E':
            case 'e':
                System.out.println("Was found E");
                break;
            default:
                System.out.println("Not found.");
                break;
            */

            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println(switchValue + " was found.");
                break;
            default:
                System.out.println("Not found.");
                break;
        }


    }
}

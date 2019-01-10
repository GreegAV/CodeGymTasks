package com.codegym.task.task04.task0410;

/* 
Come on, lucky seven!
Write the checkInterval method.
The method should check whether an integer is in the range from 50 to 100
 and display the result on the screen as follows:
 "The number a is not in the interval." or
 "The number a is in the interval.",
 where a is the method argument.

Example for 112:
The number 112 is not in the interval.

Example for 60:
The number 60 is in the interval.


Requirements:
1. The program should display text on the screen.
2. The main method should not call System.out.println or System.out.print().
3. The main method must call the checkInterval method.
4. The checkInterval method must be static void.
5. The checkInterval method should display text on the screen in accordance with the task conditions.

*/

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int a) {
        //write your code here
        if (a > 50 & a < 100)
            System.out.println("The number " + a + " is in the interval.");
        else
            System.out.println("The number " + a + " is not in the interval.");

    }
}
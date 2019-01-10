package com.codegym.task.task04.task0426;

/* 
Labels and numbers
Use the keyboard to enter an integer. Display a string description as follows:
"Negative even number" - if the number is negative and even,
"Negative odd number" - if the number is negative and odd,
"Zero" - if the number is 0,
"Positive even number" - if the number is positive and even,
"Positive odd number" - if the number is positive and odd.

Example for 100:
Positive even number

Example for -51:
Negative odd number


Requirements:
1. The program should read a number from the keyboard.
2. The program should use System.out.println() or System.out.print().
3. If the number is negative and even, display "Negative even number".
4. If the number is negative and odd, display "Negative odd number".
5. If the number is 0, display "Zero".
6. If the number is positive and even, display "Positive even number".
7. If the number is positive and odd, display "Positive odd number".
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        if (n > 0 && n % 2 == 0) System.out.println("Positive even number");
        if (n < 0 && n % 2 == 0) System.out.println("Negative even number");
        if (n < 0 && n % 2 != 0) System.out.println("Negative odd number");
        if (n > 0 && n % 2 != 0) System.out.println("Positive odd number");
        if (n == 0) System.out.println("Zero");
    }
}

package com.codegym.task.task04.task0423;

/* 
Bouncer policy
Use the keyboard to enter the name and age. If the age is more than 20, display "18 is old enough".


Requirements:
1. The program should read lines from the keyboard.
2. The program should use System.out.println() or System.out.print().
3. If the age is more than 20, display "18 is old enough" and nothing else.
4. If the age is less than or equal to 20, don't display anything.

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        if (scanner.nextInt() > 20)
            System.out.println("18 is old enough");
    }
}

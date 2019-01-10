package com.codegym.task.task04.task0422;

/* 
18+
Use the keyboard to enter the name and age. If the age is less than 18, display "Grow up a little more".


Requirements:
1. The program should read data from the keyboard twice.
2. The program should use System.out.println() or System.out.print().
3. If the age is less than 18, display "Grow up a little more" and nothing else.
4. If the age is greater than or equal to 18, don't display anything.

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        scanner.next();
        if (scanner.nextInt() < 18)
            System.out.println("Grow up a little more");

    }
}

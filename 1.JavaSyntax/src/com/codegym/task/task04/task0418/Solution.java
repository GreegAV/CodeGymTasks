package com.codegym.task.task04.task0418;

/* 
Minimum of two numbers
Use the keyboard to enter two integers, and display the minimum. If the two numbers are equal, display either of them.


Requirements:
1. The program should read the numbers from the keyboard.
2. The program must display a number on the screen.
3. The program should display the minimum of two integers.
4. If the two numbers are equal, display either of them.

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println(Math.min(scanner.nextInt(), scanner.nextInt()));
    }
}
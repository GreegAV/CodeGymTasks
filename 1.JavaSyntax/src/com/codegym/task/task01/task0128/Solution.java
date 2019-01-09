package com.codegym.task.task01.task0128;

/* 
As simple as 2+2
Write a program that calls the sum method with the arguments 2 and 2.

Requirements:
1. The program should display the sum of 2 and 2.
2. The main method should call the sum method with the arguments 2 and 2.
3. The main method should not call a screen output method.
4. Don't change the sum method.

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        sum(2, 2);
    }

    public static void sum(int a, int b) {
        int c = a + b;
        System.out.print(c);
    }
}

package com.codegym.task.task02.task0214;

/* 
Minimum of two numbers
Write a function that returns the minimum of two numbers.

Hint:
You need to write the body of the existing min function.


Requirements:
1. The program should display text on the screen.
2. The min method should not display text on the screen.
3. The main method should call the min method three times.
4. The main method should display the result of the min method. Each time, on a new line.
5. The min method must return the minimum of the numbers a and b.

*/
public class Solution {
    public static int min(int a, int b) {
        //write your code here
        return (a > b ? b : a);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
}
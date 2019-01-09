package com.codegym.task.task01.task0127;

/* 
Square of a number
Write a program that displays the square of 5 on the screen.

Requirements:
1. The program should output text.
2. The main method should call the sqr method with 5 as an argument.
3. The main method should display the result of the sqr method.
4. Don't change the sqr method.
5. The displayed text must match the task conditions.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sqr(5));
        //write your code here
    }

    public static int sqr(int a) {
        return a * a;
    }
}

package com.codegym.task.task02.task0218;

/* 
Repetition is the mother of all learning
Implement the print3 method. The method should display the passed string 3 times.
Each time, on a new line.

Requirements:
1. The program should display text on the screen.
2. The main method should not call System.out.println or System.out.print.
3. The print3 method should display the text on the screen.
4. The main method should call the print3 method only once.
5. The print3 method should display the string 3 times. Each time, on a new line.

*/
public class Solution {
    public static void print3(String s) {
        //write your code here
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }

    public static void main(String[] args) {
        print3("I love you!");
    }
}
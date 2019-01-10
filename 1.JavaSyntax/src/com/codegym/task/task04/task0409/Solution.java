package com.codegym.task.task04.task0409;

/* 
Closest to 10
Write the displayClosestToTen method. The method should display the argument that is nearest to 10.
For example, given the numbers 8 and 11, 11 is closest to ten.
If both numbers are equally close to 10, then display either of them.

Hint:
use the public static int abs(int a) method, which returns the absolute value of a number.


Requirements:
1. The program should display text on the screen.
2. The main method should not call System.out.println or System.out.print().
3. The main method should call the displayClosestToTen method.
4. The displayClosestToTen method should call the abs method.
5. The displayClosestToTen method should display a number on the screen in accordance with the task conditions.

*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        // write your code here
        if (abs(a-10)>abs(b-10))
            System.out.println(b);
        else
            System.out.println(a);

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}
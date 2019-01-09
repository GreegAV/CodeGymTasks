package com.codegym.task.task01.task0129;

/* 
Calculate the circumference of a circle
Display the circumference of a circle, which is calculated using the formula: C = 2 * pi * radius.
The result is a fractional number (double).
Use 3.14 as the value of pi.


Requirements:
1. In the printCircleCircumference method, you need to display the circle circumference,
which is calculated using the formula: 2 * pi * radius.
2. The main method should call the printCircleCircumference method with 5 as an argument.
3. The main method should not call a screen output method.
4. The program should display the circumference of a circle with a radius of 5.

*/

public class Solution {
    public static void main(String[] args) {
        printCircleCircumference(5);
    }

    public static void printCircleCircumference(int radius) {
        //write your code here
        System.out.println(2 * 3.14 * radius);
    }
}
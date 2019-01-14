package com.codegym.task.task06.task0612;

/* 
Calculator
Make a Calculator class, which will have 5 static methods:
int plus(int a, int b) - returns the sum of a and b
int minus(int a, int b) - returns the difference between a and b
int multiply(int a, int b) - returns the product of a and b
double divide(int a, int b) - returns the result of dividing a by b
double percent(int a, int b) - returns b as a percentage of a


Requirements:
1. The plus method must return the sum of a and b.
2. The minus method must return the difference between a and b.
3. The multiply method must return the product of a and b.
4. The divide method must return the result of dividing a by b.
5. The percent method must return b as a percentage of a.

*/

public class Calculator {
    public static int plus(int a, int b) {
        //write your code here
        return a + b;
    }

    public static int minus(int a, int b) {
        //write your code here
        return a - b;
    }

    public static int multiply(int a, int b) {
        //write your code here
        return a * b;
    }

    public static double divide(int a, int b) {
        //write your code here
        return b == 0 ? 0 : (double) a / (double) b;
    }

    public static double percent(int a, int b) {
        //write your code here
        return a * b / 100.0;
    }

    public static void main(String[] args) {
    }
}
package com.codegym.task.task02.task0217;

/* 
MMinimum of four numbers
Write a function that computes the minimum of four numbers.
The function min(a, b, c, d) should use (call) the function min(a, b)

Hint:
You need to write the body of the two existing min functions.


Requirements:
1. The program should display text on the screen.
2. The min methods should not display text on the screen.
3. The main method should call min(a, b) and min(a, b, c, d).
4. The main method should display the result of the min methods. Each time, on a new line.
5. The min(a, b) method must return the minimum of the numbers a and b.
6. The min(a, b, c, d) method must use the min(a, b) method.
7. The min(a, b, c, d) method must return the minimum of the numbers a, b, c, and d.

*/
public class Solution {
    public static int min(int a, int b, int c, int d) {
        //write your code here
        return min(min(a, b), min(c, d));
    }

    public static int min(int a, int b) {
        //write your code here
        return (a > b ? b : a);
    }

    public static void main(String[] args) throws Exception {
        System.out.println(min(-20, -10));
        System.out.println(min(-20, -10, -30, -40));
        System.out.println(min(-20, -10, -30, 40));
        System.out.println(min(-40, -10, -30, 40));
    }
}
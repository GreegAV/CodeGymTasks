package com.codegym.task.task02.task0216;

/* 
Minimum of three numbers
Write a function that computes the minimum of three numbers.

Hint:
You need to write the body of the existing min function.


Requirements:
1. The program should display text on the screen.
2. The min method should not display text on the screen.
3. The main method should call the min method four times.
4. The main method should display the result of the min method. Each time, on a new line.
5. The min method must return the minimum of the numbers a, b, and c.

*/
public class Solution {
    public static int min(int a, int b, int c) {
        //write your code here
        return min2(min2(a, b), c);//напишите тут ваш код
    }

    private static int min2(int x, int y) {
        return (x > y ? y : x);
    }


    public static void main(String[] args) throws Exception {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }

}
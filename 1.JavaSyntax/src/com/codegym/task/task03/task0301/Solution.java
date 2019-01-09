package com.codegym.task.task03.task0301;

/* 
Dividing is good
Implement public static void div(int a, int b).
The method should divide the first number by the second, and display the result of dividing a by b.
The displayed result should be an integer.


Requirements:
1. The div method must divide a by b.
2. The div method must display the result of the division.
3. The main method should call the div method 3 times.
4. The main method should not call a screen output method.
5. The program should output three numbers: 2 1 0. Each number on a separate line.

*/

public class Solution {
    public static void main(String[] args) {
        div(6, 3);
        div(10, 6);
        div(2, 4);
    }

    public static void div(int a, int b) {
        //write your code here
        System.out.println(a / b);
    }
}

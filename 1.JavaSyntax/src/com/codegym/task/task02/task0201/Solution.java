package com.codegym.task.task02.task0201;

/* 
Implement the print method
In the print method, display the passed string 4 times. Each time, on a new line.

Requirements:
1. The program should display text on the screen.
2. The main method should not call System.out.println or System.out.print.
3. The print method should display the text on the screen.
4. The main method should call the Solution class's print method exactly twice.
5. The print method should display the string 4 times. Each time, on a new line.

*/
public class Solution {
    public static void main(String[] args) {
        print("Java is easy to learn!");
        print("Java opens many opportunities!");
    }

    public static void print(String s) {
        //write your code here
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
    }
}

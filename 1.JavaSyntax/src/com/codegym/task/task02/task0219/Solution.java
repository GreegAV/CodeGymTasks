package com.codegym.task.task02.task0219;

/* 
Print three times
Implement the print3 method. The method should display the passed string (word) three times, but on the same line.
Words must be separated by a space and should not merge into one.


Requirements:
1. The program should display text on the screen.
2. The main method should not call System.out.println or System.out.print.
3. The print3 method should display the text on the screen.
4. The main method should call the print3 method only twice.
5. The print3 method should display the passed string (word) three times, but on the same line.

*/
public class Solution {
    public static void print3(String s) {
        //write your code here
        System.out.println(s + " " + s + " " + s);
    }

    public static void main(String[] args) {
        print3("window");
        print3("file");
    }
}
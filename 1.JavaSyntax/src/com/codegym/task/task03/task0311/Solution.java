package com.codegym.task.task03.task0311;

/*
Printing strings
Implement the public static void writeToConsole(String s) method, which adds "printing: " to the beginning of the string and displays the altered string.

Example output for "Hello, World! ":
printing: Hello, World!


Requirements:
1. Add a writeToConsole method that takes a String argument.
2. The writeToConsole method must be void.
3. The writeToConsole method must be static.
4. The writeToConsole method must be public.
5. The writeToConsole method should add "printing: " to the beginning of the string and display the result.
6. The program should display "printing: Hello, World!".

*/

public class Solution {
    public static void main(String[] args) {
        writeToConsole("Hello, World!");
    }

    public static void writeToConsole(String s) {
        //write your code here
        System.out.println("printing: "+s);
    }
}

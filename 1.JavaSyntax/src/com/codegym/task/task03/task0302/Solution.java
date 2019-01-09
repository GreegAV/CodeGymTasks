package com.codegym.task.task03.task0302;

/* 
Display right away
Add the public static void printString(String s) method, and write code that will make it display the passed string.


Requirements:
1. Add a printString method that takes a String argument.
2. The printString method must be void.
3. The printString method must be static.
4. The printString method must be public.
5. The printString method must display the passed text.
6. The program should display "Hello, Amigo!".

*/
public class Solution {
    // write your code here
    public static void printString(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        printString("Hello, Amigo!");
    }
}

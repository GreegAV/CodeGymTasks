package com.codegym.task.task09.task0908;

/*
Exception while working with strings
Catch (and display the type of) the exception that occurs when the following code is executed:
String s = null;
String m = s.toLowerCase();


Requirements:
1. The program should display a message on the screen.
2. The program must have a try-catch block.
3. The program must catch a specific type of exception, not all possible exceptions (i.e. not Exception).
4. The displayed message must contain the type of exception that occurred.
5. Don't delete the existing code in the main method.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            System.out.println(e.getClass());
        }
    }
}
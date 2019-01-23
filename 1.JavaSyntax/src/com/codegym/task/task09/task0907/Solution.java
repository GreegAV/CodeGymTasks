package com.codegym.task.task09.task0907;

/* 
Exception when working with numbers
Catch the exception that occurs when the following code is executed:
int a = 42 / 0;
Display the type of exception caught.


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
            int a = 42 / 0;
        } catch (ArithmeticException a) {
            System.out.println("ArithmeticException");
        }
    }
}

package com.codegym.task.task09.task0912;

/* 
Exception when working with numbers
Catch (and display the type of) the exception that occurs when the following code is executed:
int num = Integer.parseInt("XYZ");
System.out.println(num);


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
            int num = Integer.parseInt("XYZ");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println(e.getClass());
        }
        //write your code here
    }
}

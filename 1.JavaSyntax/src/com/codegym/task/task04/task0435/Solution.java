package com.codegym.task.task04.task0435;

/* 
Even numbers
Use a for loop to display even numbers from 1 to 100 inclusive.
Display each value on a new line.


Requirements:
1. The program should not read text from the keyboard.
2. The program should display text on the screen.
3. The program should display even numbers from 1 to 100 inclusive. Display each value on a new line.
4. The program must use a for loop.


*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                System.out.println(i);
        }

    }
}

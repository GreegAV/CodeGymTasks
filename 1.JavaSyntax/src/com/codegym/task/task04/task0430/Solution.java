package com.codegym.task.task04.task0430;

/* 
1 to 10
Display the numbers from 1 to 10 using a while loop. Each value should be on a new line.


Requirements:
1. The program should not read the numbers from the keyboard.
2. The program should display numbers on the screen.
3. Each value should be displayed on a new line.
4. The program should display the numbers from 1 to 10.
5. The program must use a while loop.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int t = 1;
        while (t < 11) {
            System.out.println(t);
            t++;
        }
    }
}
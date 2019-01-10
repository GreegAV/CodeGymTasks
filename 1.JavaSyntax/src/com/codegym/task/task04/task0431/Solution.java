package com.codegym.task.task04.task0431;

/* 
From 10 to 1
Display the numbers from 10 to 1 using a while loop. Each value should be on a new line.


Requirements:
1. The program should not read the numbers from the keyboard.
2. The program should display numbers on the screen.
3. Each value should be displayed on a new line.
4. The program should display the numbers from 10 to 1.
5. The program must use a while loop.

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int t = 10;
        while (t >0) {
            System.out.println(t);
            t--;
        }
    }
}

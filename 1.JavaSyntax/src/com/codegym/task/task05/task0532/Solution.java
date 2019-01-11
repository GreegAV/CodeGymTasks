package com.codegym.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Task about algorithms
Write a program that:
1. reads a number N (must be greater than 0) from the console
2. reads N numbers from the console
3. Displays the maximum of the N entered numbers.


Requirements:
1. The program should read the numbers from the keyboard.
2. The program must display a number on the screen.
3. The class must have a public static void main method.
4. Don't add new methods to the Solution class.
5. The program should display the maximum of the N entered numbers.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        if (n > 0) {
            int maximum = Integer.parseInt(reader.readLine());
            for (int i = 1; i < n; i++) {
                maximum = Math.max(maximum, Integer.parseInt(reader.readLine()));
            }
            System.out.println(maximum);
        }
    }
}
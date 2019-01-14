package com.codegym.task.task06.task0620;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Fixing the mistakes of youth
Task: The program takes two numbers from the keyboard and displays the maximum using a phrase like "The max is 25".


Requirements:
1. The program must read data from the keyboard.
2. The program should display the result on the screen.
3. The displayed text should start with "The max is".
4. The displayed text should end with the maximum of the 2 entered numbers.

*/

public class Solution {
    public static int max = 100;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String max = "The max is ";
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        max += a > b ? a : b;

        System.out.println(max);
    }

}

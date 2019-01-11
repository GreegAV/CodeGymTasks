package com.codegym.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Improving functionality
Current implementation: The program reads two numbers from the keyboard and displays the minimum.
New task: The program reads five numbers from the keyboard and displays the minimum.


Requirements:
1. The program should read the numbers from the keyboard.
2. The class must have a public static void main method.
3. The class must have a public static min method that takes 5 int arguments.
4. The min method must return the minimum of the 5 passed numbers. If there are several minimum numbers, return any of them.
5. The program should display a string that starts with "Minimum = ".
6. The program should display a string that ends with the minimum of the 5 entered numbers.

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int minimum = min(
                Integer.parseInt(reader.readLine()),
                Integer.parseInt(reader.readLine()),
                Integer.parseInt(reader.readLine()),
                Integer.parseInt(reader.readLine()),
                Integer.parseInt(reader.readLine())
        );

        System.out.println("Minimum = " + minimum);
    }

    public static int min(int a, int b, int c, int d, int e) {
        return min2(a, min2(b, min2(c, min2(d, e))));
    }

    public static int min2(int a, int b) {
        return a < b ? a : b;
    }
}

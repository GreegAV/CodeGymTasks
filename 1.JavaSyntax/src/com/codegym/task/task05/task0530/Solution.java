package com.codegym.task.task05.task0530;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Boss, something weird is happening
Task: The program reads two numbers from the keyboard and displays their sum on the screen.


Requirements:
1. The program should read the numbers from the keyboard.
2. There must be only one main method in the class.
3. The program should display a string that starts with "Sum = ".
4. The program should display a string that ends with the sum of the entered numbers.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int sum = a + b;
        System.out.println("Sum = " + sum);
    }
}

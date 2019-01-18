package com.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Going national
Write a program that reads a string from the keyboard.
The program should change the first letter of each word to uppercase.
Display the result on the screen.

Example input:
sam i am.

Example output:
Sam I Am.


Requirements:
1. The program should display text on the screen.
2. The program should read a string from the keyboard.
3. The Solution class must have one method.
4. The program should change the first letter of each word to uppercase.

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] result = s.toCharArray();
        result[0] = Character.toUpperCase(result[0]);

        for (int i = 0; i < result.length; i++) {
            if (Character.isSpaceChar(result[i]))
                result[i + 1] = Character.toUpperCase(result[i + 1]);
        }
        System.out.println(result);
    }
}

package com.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Min and max in arrays
Create an array of 20 numbers.
Populate it with numbers from the keyboard.
Find the maximum and minimum numbers in the array.
Display the maximum and minimum numbers, separated by a space.


Requirements:
1. Create an array of integers (int[]) with 20 elements.
2. Read 20 integers from the keyboard and add them to the array.
3. Find the maximum and minimum integers, and then display them separated by a space.
4. Use a for loop.

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        //write your code here
        int[] ints = new int[20];
        for (int i = 0; i < 20; i++) {
            ints[i] = Integer.parseInt(reader.readLine());
            if (ints[i] > maximum)
                maximum = ints[i];
            if (ints[i] < minimum)
                minimum = ints[i];
        }
        System.out.print(maximum + " " + minimum);
    }
}

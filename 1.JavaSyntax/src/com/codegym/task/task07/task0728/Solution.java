package com.codegym.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
In decreasing order
Task: Write a program that reads 20 numbers from the keyboard and displays them in decreasing order.


Requirements:
1. The program should read 20 integers from the keyboard.
2. The program should display 20 numbers.
3. The Solution class must have a public static void sort(int[] array) method.
4. The main method should call the sort method.
5. The sort method should sort the passed array in decreasing order.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        //write your code here
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
    }
}

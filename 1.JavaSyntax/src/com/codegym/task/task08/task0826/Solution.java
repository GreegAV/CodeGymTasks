package com.codegym.task.task08.task0826;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Five winners
Create an array of 20 numbers.
Populate it with numbers from the keyboard.
Display the five largest numbers.
Each value should be on a new line.


Requirements:
1. The program should display numbers on the screen.
2. The program should read values from the keyboard.
3. The Solution class must have two methods.
4. The sort() method should sort the array of numbers from highest to lowest.
5. The main() method should call the sort() method.
6. The program should display the five largest numbers in the array. Each value should be on a new line.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
    }

    public static void sort(int[] array) {
        //write your code here
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }

    }
}

package com.codegym.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
Ascending numbers
Task: Write a program that reads 5 numbers from the keyboard and displays them in ascending order.

Example input:
3
2
15
6
17

Example output:
2
3
6
15
17


Requirements:
1. The program should read 5 numbers from the keyboard.
2. The program should display 5 numbers, each on a new line.
3. The output must contain the same numbers that were entered (order is not important).
4. The displayed numbers should be sorted in ascending order.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //write your code here
        int[] list = new int[5];
        for (int i = 0; i < 5; i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(list);
        for (int tmp : list) {
            System.out.println(tmp);
        }
    }
}

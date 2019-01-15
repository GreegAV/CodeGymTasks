package com.codegym.task.task07.task0704;

import java.util.Scanner;

/* 
Flip the array
1. Create an array of 10 numbers.
2. Enter 10 numbers from the keyboard and write them to the array.
3. Display the elements of the array in reverse order. Display each value on a new line.


Requirements:
1. The program must create an array of 10 integers.
2. The program should read numbers for the array from the keyboard.
3. The program should display 10 values, each on a new line.
4. The array must be displayed in reverse order.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int[] ints = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = new Scanner(System.in).nextInt();
        }
        for (int i = ints.length - 1; i >= 0; i--) {
            System.out.println(ints[i]);
        }
    }
}


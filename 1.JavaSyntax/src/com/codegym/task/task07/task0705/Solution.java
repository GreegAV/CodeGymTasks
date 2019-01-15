package com.codegym.task.task07.task0705;

import java.util.Scanner;/*
One large array and two small ones
1. Create an array of 20 numbers.
2. Populate it with values ​​from the keyboard.
3. Create two arrays of 10 numbers each.
4. Copy the large array into the two small ones: half the numbers into the first small array,
and the second half into the second small array.
5. Display the second small array, each value on a new line.


Requirements:
1. The program must create an array of 20 integers.
2. The program should read 20 numbers from the keyboard for the large array.
3. The program must create two small arrays of 10 numbers each.
4. The program must copy one half of the large array into the first small array,
copy the second half into the second array, and then display that array on the screen.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int[] ints = new int[20];
        int[] ints2 = new int[10];
        int[] ints3 = new int[10];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = new Scanner(System.in).nextInt();
        }
        for (int i = 0; i < ints2.length; i++) {
            ints2[i] = ints[i];
            ints3[i] = ints[i + 10];
            System.out.println(ints3[i]);
        }
    }
}

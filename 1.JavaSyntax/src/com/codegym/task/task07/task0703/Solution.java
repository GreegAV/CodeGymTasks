package com.codegym.task.task07.task0703;

import java.util.Scanner;

/* 
Lonely arrays interact
1. Create an array of 10 strings.
2. Create an array of 10 numbers.
3. Enter 10 strings from the keyboard, and put them in an array of strings.
4. In each element of the number array, record the length of the string
whose string array index coincides with the current index of the number array.

Display the contents of the number array, each value on a new line.

Requirements:
1. The program must create an array of 10 strings.
2. The program must create an array of 10 integers.
3. The program should read strings for the array from the keyboard.
4. The program must record the lengths of the strings in the number array, and then display them on the screen.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        String[] strings = new String[10];
        int[] ints = new int[10];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = new Scanner(System.in).nextLine();
            ints[i] = strings[i].length();
            System.out.println(ints[i]);
        }
    }
}

package com.codegym.task.task07.task0702;

import java.util.Scanner;/*
String array in reverse order
1. Create an array of 10 strings.
2. Enter 8 strings from the keyboard and save them in the array.
3. Display the contents of the entire array (10 elements) on the screen in reverse order. Each element on a new line.


Requirements:
1. The program must create an array of 10 strings.
2. The program should read 8 strings for the array from the keyboard.
3. The program should display 10 strings, each on a new line.
4. The array of strings (10 elements) must be displayed in the reverse order.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        String[] strings=new String[10];
        for (int i = 0; i <8 ; i++) {
            strings[i]=new Scanner(System.in).nextLine();
        }
        for (int i = strings.length-1; i >=0 ; i--) {
            System.out.println(strings[i]);
        }
    }
}
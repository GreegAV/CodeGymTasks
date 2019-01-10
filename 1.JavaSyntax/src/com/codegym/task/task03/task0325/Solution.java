package com.codegym.task.task03.task0325;

import java.io.*;
import java.util.Scanner;

/*
Financial expectations
Use the keyboard to enter the number n.
Display the phrase "I will earn $n per hour" on the screen.

For example:
I will earn $100 per hour


Requirements:
1. The program should output text.
2. The program must read data from the keyboard.
3. The displayed text must contain the entered number n.
4. The displayed text must fully match the task conditions.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scn = new Scanner(System.in);
        System.out.println("I will earn $"+scn.nextInt()+" per hour");
    }
}

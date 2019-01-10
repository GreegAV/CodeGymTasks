package com.codegym.task.task04.task0432;

/*
You can't have too much of a good thing
Use the keyboard to enter a string and a number N.
Use a while loop to display the string N times. Each value should be on a new line.

Example input:
abc
2

Example output:
abc
abc


Requirements:
1. The program should read the text from the keyboard.
2. The program should display text on the screen.
3. Each value should be displayed on a new line.
4. The program should display the string N times.
5. The program must use a while loop.

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int number = scanner.nextInt();
        while (number > 0) {
            System.out.println(string);
            number--;
        }

    }
}

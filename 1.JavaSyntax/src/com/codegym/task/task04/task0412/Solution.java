package com.codegym.task.task04.task0412;

/* 
Positive and negative numbers
Use the keyboard to enter a number.
If the number is positive, then double it.
If the number is negative, add one.
If the entered number is zero, display zero.
Display the result on the screen.


Requirements:
1. The program should read a number from the keyboard.
2. The program must display a number on the screen.
3. If the entered number is positive, double it and display the result.
4. If the entered number is negative, increase it by one and display the result.
5. If the entered number is zero, display zero.

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number == 0)
            System.out.println("0");
        if (number > 0)
            System.out.println(number*2);
        if (number < 0)
            System.out.println(number+1);

    }

}
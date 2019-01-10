package com.codegym.task.task04.task0420;

/*
Sorting three numbers
Use the keyboard to enter three numbers, and display them in descending order.
The displayed numbers must be separated by spaces.


Requirements:
1. The program should read the numbers from the keyboard.
2. The program should display numbers on the screen.
3. The program should display three numbers separated by spaces.
4. The program should display the numbers in descending order.

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a >= b && a >= c) {
            if (b >= c) {
                System.out.println(a + " " + b + " " + c);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        }
        if (a < b && a < c) {
            if (b < c) {
                System.out.println(c + " " + b + " " + a);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        }
        if (a < c && a >= b) {
            System.out.println(c + " " + a + " " + b);
        }

        if (a < b && a >= c) {
            System.out.println(b + " " + a + " " + c);
        }

    }
}
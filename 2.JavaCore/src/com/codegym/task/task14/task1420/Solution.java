package com.codegym.task.task14.task1420;

/* 
GCD
Greatest common divisor (GCD).
Enter 2 positive integers from the keyboard.
Display the greatest common divisor.


Requirements:
1. The program should read 2 lines from the keyboard.
2. If the entered lines can't be converted to positive integers, throw an exception.
3. The program should display data on the screen.
4. The program should display the greatest common divisor (GCD)
of the numbers read from the keyboard and then terminate successfully.

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a <= 0 || b <= 0) throw new Exception();

        int max = Math.max(a, b);
        for (int i = max; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println(i);
                break;
            }
        }


    }
}
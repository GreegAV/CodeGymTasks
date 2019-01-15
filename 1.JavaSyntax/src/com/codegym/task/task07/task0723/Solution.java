package com.codegym.task.task07.task0723;

/* 
Countdown
Write a program that counts down from 30 to 0 and then displays "Boom!".
The program should advance the countdown 10 times per second. To add a delay to the program, use:
Thread.sleep(100); // Delay for one tenth of a second.

For example:
30
29
…
1
0
Boom!


Requirements:
1. The program must not read data from the keyboard.
2. The program should display a countdown from 30 to 0. Each number on a new line.
3. The program should display "Boom!" after the countdown.
4. The program should use "Thread.sleep (100);" 31 times.

*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);

            //write your code here
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println("\"Boom\" failed!");
            }
        }

        System.out.println("Boom!");
    }
}

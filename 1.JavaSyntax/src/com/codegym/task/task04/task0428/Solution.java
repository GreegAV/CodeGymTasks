package com.codegym.task.task04.task0428;

/* 
Positive number
Use the keyboard to enter three integers. Display the number of positive numbers in the original set.

Here are some examples:
a) if you enter the numbers
-4
6
6
then we display
2

b) if you enter the numbers
-6
-6
-3
then we display
0

c) if you enter the numbers
0
1
2
then we display
2


Requirements:
1. The program should read the numbers from the keyboard.
2. The program must display a number on the screen.
3. The program should display the number of positive numbers in the original set.
4. If there are no positive numbers, the program should display "0".
5. Note that 0 is not a positive or negative number.

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scn = new Scanner(System.in);
        int d = 0;
        for (int i = 0; i < 3; i++) {
            if (scn.nextInt() > 0)
                d++;
        }
        System.out.println(d);
    }
}

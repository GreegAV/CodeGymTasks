package com.codegym.task.task04.task0429;

/* 
Positive and negative numbers
Use the keyboard to enter three integers. Display the number of positive numbers and the number of negative numbers in the original set, in the following form:
"Number of negative numbers: a" and "Number of positive numbers: b", where a and b are the unknowns.

Here are some examples:
a) if you enter the numbers
2
5
6
then we display
Number of negative numbers: 0
Number of positive numbers: 3

b) if you enter the numbers
-2
-5
6
then we display
Number of negative numbers: 2
Number of positive numbers: 1


Requirements:
1. The program should read the numbers from the keyboard.
2. The program should display text on the screen.
3. The program should display the number negative numbers in the original set.
4. The program should display the number of positive numbers in the original set.
5. If there are no negative numbers, the program should display "Number of negative numbers: 0".
6. If there are no positive numbers, the program should display "Number of positive numbers: 0".
7. Note that 0 is not a positive or negative number.

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scn = new Scanner(System.in);
        int p = 0;
        int n = 0;

        for (int i = 0; i < 3; i++) {
            int t = scn.nextInt();
            if (t == 0) continue;
            if (t > 0)
                p++;
            else
                n++;

        }
        System.out.println("Number of negative numbers: " + n);
        System.out.println("Number of positive numbers: " + p);
    }
}

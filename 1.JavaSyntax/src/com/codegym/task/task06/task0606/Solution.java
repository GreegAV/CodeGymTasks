package com.codegym.task.task06.task0606;

import java.io.IOException;
import java.util.Scanner;

/*
Even and odd digits
Use the keyboard to enter a number. Determine the number of even digits and odd digits in the entered number.
If a number is divisible by 2 without a remainder (i.e. the remainder is zero), then it is even.
And we'll increase the even digit counter (static variable even) by 1.
Otherwise, the number is odd, so we'll increase the odd digit counter (static variable odd).
Display the following message: "Even: a Odd: b", where a is the number of even digits and b is the number of odd digits.

Example for 4445:
Even: 3 Odd: 1


Requirements:
1. The program must read data from the keyboard.
2. The main method should calculate how many even digits are in the entered number
and then write this number to the variable even.
3. The main method should calculate how many odd digits are in the entered number
and then write this number to the variable odd.
4. The program should display text on the screen.
5. The displayed text must match the task conditions.

*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int testNumber = scanner.nextInt();
        while (testNumber > 10) {
            int rest = testNumber % 10;
            testNumber /= 10;
            if (rest % 2 > 0)
                odd++;
            else
                even++;
        }
        if (testNumber % 2 > 0)
            odd++;
        else
            even++;
        System.out.println("Even: " + even + " Odd: " + odd);

    }
}

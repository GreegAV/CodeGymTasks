package com.codegym.task.task04.task0414;

/* 
Number of days in the year
Use the keyboard to enter a year, and then determine the number of days in the year. Display the result as follows:
Number of days in the year: x
, where
x is 366 for a leap year, and
x is 365 for an ordinary year.

Hint:
A leap year is 366 days, but an ordinary year is 365 days.
1) if the year is evenly divisible by 400, then it is a leap year;
2) for other years, if the year is evenly divisible by 100, then it is a regular year;
3) for other years, if the year is evenly divisible by 4, then it is a leap year;
4) all remaining years are not leap years.
Thus, the years 1700, 1800, and 1900 are not leap years, since they are multiples of 100 but not 400.
The years 1600 and 2000 are leap years, since they are multiples of 100 and multiples of 400.
The years 2100, 2200 and 2300 are not leap years.


Requirements:
1. The program should read a number from the keyboard.
2. The program should display text on the screen according to the task conditions.
3. If the entered year is a leap year, you should display: "Number of days in the year: 366".
4. If the entered year is not a leap year, you should display: "Number of days in the year: 365".

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner num = new Scanner(System.in);
        int year = num.nextInt();
        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0)
            System.out.println("Number of days in the year: 365");
        else
            System.out.println("Number of days in the year: 366");
    }
}
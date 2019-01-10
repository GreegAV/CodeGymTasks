package com.codegym.task.task04.task0413;

/* 
Day of the week
Use the keyboard to enter a number representing a day of the week.
Then, depending on the entered number, display the name of the day of the week:
"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday",
if you enter a number greater than 7 or less than 1, display "No such day of the week".

Example for number 5:
Friday

Example for number 10:
No such day of the week


Requirements:
1. The program should read a number from the keyboard.
2. The program should display text on the screen.
3. If you enter a number from 1 to 7, you need to display the name of the day of the week.
4. If you enter a number outside the range of 1 to 7, then display a notification that there is no such day of the week.

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        if (day < 1 || day > 7)
            System.out.println("No such day of the week");
        else
            System.out.println(week[day - 1]);
    }
}
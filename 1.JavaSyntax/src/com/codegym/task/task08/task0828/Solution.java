package com.codegym.task.task08.task0828;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Month number
The program reads the name of the month from the keyboard and then displays its number on the screen in a phrase like:
"May is month 5".
Use collections.

Requirements:
1. The program should read one value from the keyboard.
2. The program should display text on the screen.
3. The program must use collections.
4. The program should read from the keyboard the name of the
month and display its number on the screen according to the specified template.

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        ArrayList<String> months = new ArrayList<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("June");
        months.add("July");
        months.add("August");
        months.add("September");
        months.add("October");
        months.add("November");
        months.add("December");

        Scanner reader = new Scanner(System.in);

        String month = reader.nextLine();

        if (months.contains(month)) {
            System.out.printf("%s is month %d ", month, months.indexOf(month) + 1);
        }

    }
}
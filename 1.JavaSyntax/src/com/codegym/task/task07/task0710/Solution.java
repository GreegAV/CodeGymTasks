package com.codegym.task.task07.task0710;

import java.util.ArrayList;
import java.util.Scanner;

/* 
To the top of the list
1. Create a list of strings in the main method.
2. Add 10 strings to it from the keyboard, but only add them to the beginning of the list, not the end.
3. Use a loop to display the contents, each value on a new line.


Requirements:
1. Declare a string list variable and immediately initialize it.
2. The program should read 10 strings from the keyboard and add them to the list.
3. The program should add lines to the beginning of the list.
4. The program should display the list, each value on a new line.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(0, new Scanner(System.in).nextLine());
        }
        for (String str : strings) {
            System.out.println(str);
        }
    }
}

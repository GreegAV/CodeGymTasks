package com.codegym.task.task07.task0711;

import java.util.ArrayList;
import java.util.Scanner;

/* 
Remove and insert
1. Create a list of strings.
2. Add 5 strings from the keyboard.
3. Remove the last string and insert it at the beginning. Rinse and repeat 13 times.
4. Use a loop to display the contents, each value on a new line.


Requirements:
1. Declare a string list variable and immediately initialize it.
2. The program should read 5 strings from the keyboard.
3. Remove the last string and insert it at the beginning. Rinse and repeat 13 times.
4. The program should display the list, each value on a new line.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add(new Scanner(System.in).nextLine());
        }
        for (int i = 0; i < 13; i++) {
            String tmp = strings.get(strings.size() - 1);
            strings.remove(strings.size() - 1);
            strings.add(0, tmp);
        }
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
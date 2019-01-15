package com.codegym.task.task07.task0709;

import java.util.ArrayList;
import java.util.Scanner;

/* 
Expressing ourselves more concisely
1. Create a list of strings.
2. Read 5 strings from the keyboard and add them to the list.
3. Using a loop, find the shortest string in the list.
4. Display the string.
5. If there is more than one, display each on a new line.


Requirements:
1. Declare a string list variable and immediately initialize it.
2. The program should read 5 strings from the keyboard and write them to the list.
3. The program should display the shortest string.
4. If several strings are the shortest, then you need to display each of them on a new line.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> strings = new ArrayList<>();
        int length = Integer.MAX_VALUE;
        for (int i = 0; i < 5; i++) {
            strings.add(new Scanner(System.in).nextLine());
            if (strings.get(i).length() < length)
                length = strings.get(i).length();
        }
        for (String str : strings) {
            if (str.length() == length)
                System.out.println(str);
        }
    }
}

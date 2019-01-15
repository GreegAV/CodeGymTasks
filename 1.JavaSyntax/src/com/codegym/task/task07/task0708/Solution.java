package com.codegym.task.task07.task0708;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Longest string
1. Initialize the list of strings.
2. Read 5 strings from the keyboard and add them to this list.
3. Using a loop, find the longest string in the list.
4. Display the string. If there is more than one, display each on a new line.


Requirements:
1. Initialize the Solution class's existing strings field to a new ArrayList<>.
2. The program should read 5 strings from the keyboard and write them to the list of strings.
3. The program should display the longest string.
4. If several strings qualify as the longest, then you need to display each of them on a new line.
*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        //write your code here
        strings = new ArrayList<>();
        int length = 0;
        for (int i = 0; i < 5; i++) {
            strings.add(new Scanner(System.in).nextLine());
            if (strings.get(i).length() > length)
                length = strings.get(i).length();
        }
        for (String str : strings) {
            if (str.length() == length)
                System.out.println(str);
        }
    }
}

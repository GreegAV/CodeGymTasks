package com.codegym.task.task07.task0717;

import java.util.ArrayList;
import java.util.Scanner;

/* 
Duplicating words
1. Read 10 words from the keyboard and add them to a list of strings.
2. The doubleValues method should duplicate words like this:
alpha, beta, gamma, -> alpha, alpha, beta, beta, gamma, gamma.
3. Display the result, each value on a new line.

Requirements:
1. Declare a string list variable and immediately initialize it.
2. Read 10 lines from the keyboard and add them to the list.
3. The doubleValues method should duplicate list elements like this: alpha, beta, gamma, -> alpha, alpha, beta, beta, gamma, gamma.
4. Display the resulting list, each element on a new line.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // Read strings from the console and declare an ArrayList here
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Scanner(System.in).nextLine());
        }
        ArrayList<String> result = doubleValues(list);

        // Display result
        for (String str : result) {
            System.out.println(str);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //write your code here
        ArrayList<String> newList = new ArrayList<>();
        for (String str : list) {
            newList.add(str);
            newList.add(str);
        }
        return newList;
    }
}

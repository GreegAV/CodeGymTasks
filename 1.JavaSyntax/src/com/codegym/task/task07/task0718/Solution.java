package com.codegym.task.task07.task0718;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Checking the order
1. Read 10 words from the keyboard and add them to a list of strings.
2. Determine whether the list is ordered by increasing string length.
3. If it is not, then display the index of the first element that violates this order.


Requirements:
1. Declare a string list variable and immediately initialize it.
2. Read 10 lines from the keyboard and add them to the list.
3. If the list is ordered by increasing string length, then you don't need to display anything.
4. If the list is not ordered by increasing string length, then display the index of the first element that violates this order.

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Scanner(System.in).nextLine());
        }
        for (int i = 1; i < 10; i++) {
            if (list.get(i - 1).length() > list.get(i).length()) {
                System.out.println(i);
                break;
            }
        }


    }
}


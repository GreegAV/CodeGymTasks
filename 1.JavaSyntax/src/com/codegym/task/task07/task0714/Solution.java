package com.codegym.task.task07.task0714;

import java.util.ArrayList;
import java.util.Scanner;

/* 
Words in reverse
Read 5 words from the keyboard and add them to a list of strings.
Remove the 3rd item in the list, and then display the remaining items in reverse order.


Requirements:
1. Declare a ArrayList<String> variable and immediately initialize it.
2. Read 5 lines from the keyboard and add them to the list.
3. Remove the third element of list.
4. Display the items on the screen, each on a new line.
5. The display order must be reversed.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add(new Scanner(System.in).nextLine());
        }
        strings.remove(2);
        for (int i = strings.size() - 1; i >= 0; i--) {
            System.out.println(strings.get(i));
        }
    }
}



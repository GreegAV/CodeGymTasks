package com.codegym.task.task08.task0812;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/* 
Longest sequence
1. Create a list of numbers.
2. Use the keyboard to add 10 numbers to the list.
3. Display the length of the longest sequence of repeating numbers in the list.

Example for the list 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3

The value is 3, because the longest sequence of repeating numbers is three fours.


Requirements:
1. The program must display a number on the screen.
2. The program should read values from the keyboard.
3. In the main method, declare an ArrayList variable with Integer elements and immediately initialize it.
4. The program should add 10 numbers to the collection in accordance with the conditions.
5. The program should display the length of the longest sequence of repeating numbers in the list.

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        ArrayList<Integer> arrayList = new ArrayList<>();
        int dist = 1;
        int longest = dist;
        for (int i = 0; i < 10; i++) {
            arrayList.add(new Scanner(System.in).nextInt());
        }
        for (int i = 1; i < arrayList.size(); i++) {
            if (arrayList.get(i - 1).equals(arrayList.get(i)))
                dist++;
            else {
                longest = longest > dist ? longest : dist;
                dist = 1;
            }
        }
        longest = longest > dist ? longest : dist;
        System.out.println(longest);

    }
}
package com.codegym.task.task09.task0926;

import java.util.ArrayList;

/* 
List of number arrays
Create a list whose elements are arrays of numbers.
Add to the list five array objects whose lengths are 5, 2, 4, 7, and 0, respectively.
Fill the arrays with any data and display them on the screen.


Requirements:
1. The program must not read data from the keyboard.
2. The createList method must declare and initialize an ArrayList<int[]> variable.
3. The createList method must return the created list.
4. The createList method must add 5 elements to the list.
5. Each element in the list must be an array of numbers.
The length of the first array must be 5; the second — 2; and the rest — 4, 7, and 0, respectively.
6. The program should display the elements of all the arrays in the list. Each element on a new line.

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //write your code here
        ArrayList<int[]> list = new ArrayList<>();
        list.add(new int[]{0, 0, 0, 0, 0});
        list.add(new int[]{1, 1});
        list.add(new int[]{2, 2, 2, 2});
        list.add(new int[]{3, 3, 3, 3, 3, 3, 3});
        list.add(new int[]{});
        return list;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}

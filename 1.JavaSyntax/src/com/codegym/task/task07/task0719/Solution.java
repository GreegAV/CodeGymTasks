package com.codegym.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Display numbers in reverse order
Enter 10 numbers from the keyboard and put them in a list.
Display them in reverse order. Each element on a new line.
Use only a for loop.


Requirements:
1. Declare an integer list variable and immediately initialize it.
2. Read 10 integers from the keyboard and add them to the list.
3. Display the numbers in reverse order.
4. Use a for loop.

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
}

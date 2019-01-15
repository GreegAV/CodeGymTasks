package com.codegym.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shuffled just in time
Use the keyboard to enter 2 numbers N and M.
Enter N strings and put them in a list.
Move the first M strings to the end of the list.
Display the list, each value on a new line.

Note:
you must not create more than one list.


Requirements:
1. Declare a string list variable and immediately initialize it.
2. Read numbers N and M from the keyboard. Read N strings and add them to the list.
3. Move the first M strings to the end of the list.
4. Display the list, each value on a new line.

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //write your code here
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            strings.add(reader.readLine());
        }
        for (int i = 0; i < M; i++) {
            strings.add(strings.get(0));
            strings.remove(0);
        }
        for (String str : strings) {
            System.out.println(str);
        }
    }
}

package com.codegym.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
The end
Create a list of strings.
Enter strings from the keyboard and add them to the list.
Enter strings from the keyboard until the user enters "end". The string "end" is ignored.
Display the strings on the screen, each on a new line.


Requirements:
1. Declare a string list variable and immediately initialize it.
2. Read strings from the keyboard and add them to a list until the user enters "end".
3. Do not add "end" to the list.
4. Display the list, each value on a new line.
5. Use a for loop.

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        ArrayList<String> strings = new ArrayList<>();
        while (true) {
            String word = reader.readLine();
            if (word.equals("end"))
                break;
            strings.add(word);
        }
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
package com.codegym.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Changing functionality
Task: The program takes in strings until the user enters an empty string (by pressing Enter).
Then it converts the strings to uppercase ("mother" becomes "MOTHER") and displays them.

New task: The program takes in strings until the user enters an empty string (by pressing Enter).
Then the program builds a new list. If a string has an even number of letters, then the string is duplicated.
If the number of letters is odd, then the string is repeated three times.
The program displays the contents of the new list.

Example input:
Cat
Cats
I

Example output:
Cat Cat Cat
Cats Cats
I I I


Requirements:
1. The program must read data from the keyboard.
2. The program should display as many strings as are entered.
3. If a string has an even number of letters, then you need to duplicate the string (as in the example).
4. If a string has an odd number of letters, then you need to repeat the string three times (as in the example).
5. The program should stop reading data from the keyboard as soon as the user enters an empty string (by pressing Enter).

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            if (s.length() % 2 == 0)
                list.add(s + " " + s);
            else
                list.add(s + " " + s + " " + s);
        }
        for (String str : list) {
            System.out.println(str);
        }

    }
}

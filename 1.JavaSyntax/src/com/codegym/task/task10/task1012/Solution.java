package com.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Number of letters
Enter 10 strings from the keyboard and count the number of different letters in them
(for the 26 lowercase letters of the English alphabet). Display the results on the screen in alphabetical order.

Example output:
a 5
b 8
c 3
d 7
e 0
…
z 9


Requirements:
1. The program must read data from the keyboard 10 times.
2. The program should display text on the screen.
3. The displayed text should contain 26 lines.
4. Each line of output should contain a letter of the English alphabet, a space,
and the number of times the letter was found in the entered lines.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alphabet
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter : abcArray) {
            alphabet.add(letter);
        }
        // Read in strings
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        // write your code here
        List<Integer> occurs = new ArrayList<>();
        for (char tmp : alphabet) {
            occurs.add(0);
        }

        for (String sentence : list) {
            for (int i = 0; i < sentence.length(); i++) {
                char symbol = sentence.charAt(i);
                int position = abc.indexOf(symbol);
                if (position >= 0)
                    occurs.set(position, occurs.get(position) + 1);
            }
        }
        for (int i = 0; i < alphabet.size(); i++) {
            System.out.println(alphabet.get(i) + " " + occurs.get(i));
        }
    }
}

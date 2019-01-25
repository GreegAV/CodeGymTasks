package com.codegym.task.task09.task0923;

import java.util.Scanner;

/* 
Vowels and consonants
Write a program that reads a string from the keyboard.
The program should display two lines:
1. The first line contains only the vowels from the entered string.
2. The second contains only the consonants and punctuation marks from the entered string.
The letters should be separated by a space, each line must end with a space.

Example input:
Sam I Am.

Example output:
a I A
S m m .


Requirements:
1. The program must read data from the keyboard.
2. The program should display two lines.
3. The first line should contain only the vowels from the input string, separated by a space.
4. The second line should contain only the consonants and punctuation marks from the input string, separated by a space.
5. Each line must end with a space.

*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        StringBuilder outVowels = new StringBuilder();
        StringBuilder outOther = new StringBuilder();
        for (char chr : input.toCharArray()) {
            if (!Character.isSpaceChar(chr)) {
                if (isVowel(chr)) {
                    outVowels.append(chr);
                    outVowels.append(" ");
                } else {
                    outOther.append(chr);
                    outOther.append(" ");
                }
            }
        }
        System.out.println(outVowels);
        System.out.println(outOther);
    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Convert to lowercase

        for (char d : vowels)   // Look for vowels in the array
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
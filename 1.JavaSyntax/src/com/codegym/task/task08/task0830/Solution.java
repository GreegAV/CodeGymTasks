package com.codegym.task.task08.task0830;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Task about algorithms
Task: Enter 20 words from the keyboard and display them in alphabetical order. Each word should be on a new line.


Requirements:
1. The program should display text on the screen.
2. The program should read values from the keyboard.
3. The Solution class must have three methods.
4. The main() method should call the sort() method.
5. The sort () method should call the isGreaterThan() method.
6. The displayed words should be sorted alphabetically.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
        }

        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i ; j--) {
                if (isGreaterThan(array[i], array[j])){
                    String s = array[j];
                    array[j] = array[i];
                    array[i] = s;
                }
            }
        }
    }

    // String comparison method: 'a' is greater than 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }
}

package com.codegym.task.task08.task0813;

import java.util.HashSet;
import java.util.Set;

/* 
20 words that start with the letter "L"
You need to create a Set<String> and add 20 words that start with the letter "L".


Requirements:
1. Don't change the signature of the createSet() method.
2. The program should not display text on the screen.
3. The program should not read values from the keyboard.
4. The createSet() method must create and return a set (HashSet).
5. The set returned by the createSet() method must contain 20 words that start with the letter "L".

*/

public class Solution {
    public static Set<String> createSet() {
        //write your code here
        HashSet<String> hashSet = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            hashSet.add("L" + i);
        }
        return hashSet;
    }

    public static void main(String[] args) {

    }
}

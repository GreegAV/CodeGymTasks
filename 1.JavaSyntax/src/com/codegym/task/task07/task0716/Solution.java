package com.codegym.task.task07.task0716;

import java.util.ArrayList;

/* 
R or L
1. Create a list of words and populate it yourself.
2. The fix method should:
2.1. remove all words containing the letter "r" from the list
2.2. duplicate all words containing the letter "l".
2.3. if a word contains both "r" and "l", then leave it unchanged.
2.4. don't do anything to other words.

For example:
rose
lyre
love

Output:
lyre
love
love


Requirements:
1. The program must not read data from the keyboard.
2. The fix method should remove all words containing the letter "r" from the list.
There is an exception: words containing both "r" and "l" should be left alone.
3. The fix method must duplicate words containing the letter "l" (add another instance of this word to the list).
There is an exception: words containing both "l" and "r" should not be duplicated.
4. The fix method should not do anything with words that contain both "l" and "r".
5. The fix method should not do anything with words that don't contain either "l" or "r".

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("love"); // 1
        list.add("lyre"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        // write your code here
        ArrayList<String> newList = new ArrayList<>();
        for (String word : list) {
            if (word.contains("l") & word.contains("r")) {
                newList.add(word);
            }
            if (word.contains("l") & !word.contains("r")) {
                newList.add(word);
                newList.add(word);
            }
            if (!word.contains("l") & !word.contains("r")) {
                newList.add(word);
            }
        }
        return newList;
    }
}
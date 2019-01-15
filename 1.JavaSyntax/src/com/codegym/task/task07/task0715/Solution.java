package com.codegym.task.task07.task0715;

import java.util.ArrayList;

/* 
More Sam-I-Am
1. Create a list of the words: "Sam", "I", "Am".
2. After each word, insert the word "Ham" into the list.
3. Display the result on the screen, each list element on a new line.


Requirements:
1. The program must not read data from the keyboard.
2. Declare a string list variable and immediately initialize it.
3. Add the following words to the list: "Sam", "I", "Am".
4. After each word, add the string "Ham" to the list.
5. Display the list items on the screen, each on a new line.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> strings = new ArrayList<>();
        strings.add("Sam");
        strings.add("Ham");
        strings.add("I");
        strings.add("Ham");
        strings.add("Am");
        strings.add("Ham");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}

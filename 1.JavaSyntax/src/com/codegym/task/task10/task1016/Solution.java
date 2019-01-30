package com.codegym.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Identical words in a list
Read a list of 20 words from the keyboard.
You need to count how many times each word appears in the list.
The result should be represented as a Map<String, Integer>,
where the key is a unique word, and the value is the number of times the word appears in the list.

Display the contents of the map.
The case (uppercase/lowercase) affects the results.


Requirements:
1. The countWords method must declare and initialize a HashMap<String, Integer>.
2. The countWords method must return the created map.
3. The countWords method should add keys that correspond to unique words,
and values that correspond to how many times those words occur.
4. The program should display the resulting map.
5. The main method must call the countWords method.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<>();
        //write your code here
        ArrayList<Integer> occurs = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int count = 0;
            for (String s : list) {
                if (list.get(i).equals(s))
                    count++;
            }
            occurs.add(i, count);
        }
        for (int i = 0; i < list.size(); i++) {
            result.put(list.get(i), occurs.get(i));
        }
        return result;
    }
}


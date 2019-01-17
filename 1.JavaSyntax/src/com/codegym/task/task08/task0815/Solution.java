package com.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Census
Create a Map<String, String> and add ten entries that represent (last name, first name) pairs.
Check how many people have the same first name or last name.


Requirements:
1. The program should not display text on the screen.
2. The program should not read values from the keyboard.
3. The createMap() method must create and return a HashMap that has (String, String) elements
and contains 10 entries that represent (last name, first name) pairs.
4. The getSameFirstNameCount() method must return the number of people that have the same first name.
5. The getSameLastNameCount() method must return the number of people that have the same last name.

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //write your code here
        HashMap<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            hashMap.put("" + (i * i), "" + (i * i * i));
        }
        return hashMap;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        //write your code here
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;

        while (iterator.hasNext()) {
            if (iterator.next().getValue().equals(name))
                count++;
        }
        return count;
    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        //write your code here
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;

        while (iterator.hasNext()) {
            if (iterator.next().getKey().equals(lastName))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {

    }
}

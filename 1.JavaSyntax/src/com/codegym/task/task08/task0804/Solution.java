package com.codegym.task.task08.task0804;

import java.util.HashMap;
import java.util.Map;

/* 
Display a list of keys
There is a HashMap<String, String>. 10 different strings have been added to it.
Display a list of keys on the screen, each element on a new line.


Requirements:
1. The program must create a HashMap variable with (String, String) elements. The variable must be initialized immediately.
2. The program should not read values from the keyboard.
3. The program should add 10 different strings to the collection in accordance with the conditions.
4. The printKeys() method should display the keys in the collection, each element on a new line.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Sim", "Sim");
        map.put("Tom", "Tom");
        map.put("Arbus", "Arbus");
        map.put("Baby", "Baby");
        map.put("Cat", "Cat");
        map.put("Dog", "Dog");
        map.put("Eat", "Eat");
        map.put("Food", "Food");
        map.put("Gevey", "Gevey");
        map.put("Hugs", "Hugs");

        printKeys(map);
    }

    public static void printKeys(Map<String, String> map) {
        //write your code here
        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey());
        }
    }
}

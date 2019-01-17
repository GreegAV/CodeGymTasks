package com.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Only for the rich
Create a Map<String, Integer> and add ten entries that represent (last name, salary) pairs.
Remove from the map all people whose salary is below 500.


Requirements:
1. The program should not display text on the screen.
2. The program should not read values from the keyboard.
3. The createMap() method must create and return a HashMap that has (String, Integer)
elements and contains 10 entries that represent (last name, salary) pairs.
4. The removeItemFromMap() method must remove from the map all people whose salary is below 500.

*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //write your code here
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("" + i, i * i);
        }
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //write your code here
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getValue() < 500)
                iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}
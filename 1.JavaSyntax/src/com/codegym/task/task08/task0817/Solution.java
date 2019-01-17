package com.codegym.task.task08.task0817;

import java.util.*;

/* 
We don't need repeats
Create a Map<String, String> and add ten entries that represent (last name, first name) pairs.
Remove people with the same first name.


Requirements:
1. The program should not display text on the screen.
2. The program should not read values from the keyboard.
3. The createMap() method must create and return a HashMap that has (String, String) elements and contains 10 entries.
4. The removeFirstNameDuplicates() method must remove from the map all people who have the same first name.
5. The removeFirstNameDuplicates() method must call the removeItemFromMapByValue() method.

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //write your code here
        HashMap<String, String> hashMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            hashMap.put("" + i, "" + i + i);
        }
        return hashMap;
    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        //write your code here
        ArrayList<String> valuelist= new ArrayList<String >();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            valuelist.add(pair.getValue());
        }

        for (String text:valuelist) {
            if ( Collections.frequency(valuelist,text)>1) {
                removeItemFromMapByValue(map, text);
            }
        }
    }
//        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
////        HashMap<String, String> newMap = new HashMap<>();
////        while (iterator.hasNext()) {
////            Map.Entry<String, String> pair = iterator.next();
////            newMap.put(pair.getValue(), pair.getKey());
////            iterator.remove();
////        }
////        iterator=newMap.entrySet().iterator();
////        while (iterator.hasNext()) {
////            Map.Entry<String, String> pair = iterator.next();
////            map.put(pair.getValue(), pair.getKey());
////        }
////    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}

package com.codegym.task.task09.task0927;

import java.util.*;

/* 
Ten cats
There is a Cat class with a String variablename.
Create a Map<String, Cat> and add 10 cats represented by (name, Cat) pairs.
Get a Set of all cats from the Map and display it on the screen.


Requirements:
1. The program must not read data from the keyboard.
2. The createMap method must create a new HashMap<String, Cat> object.
3. The createMap method must add 10 cats to the map, represented by (name, Cat) pairs.
4. The createMap method must return the created map.
5. The convertMapToSet method must create and return the set of cats retrieved from the passed map.
6. The program should display all the cats in the set.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //write your code here
        Map<String, Cat> catMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            catMap.put("" + i, new Cat("" + i));
        }
        return catMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //write your code here
        Set<Cat> catSet = new HashSet<>();
        Iterator<Map.Entry<String, Cat>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            catSet.add(iterator.next().getValue());
        }
        return catSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}

package com.codegym.task.task08.task0803;

import java.util.HashMap;
import java.util.Map;

/* 
HashMap of cats
There is a Cat class with a String name.
Create a HashMap<String, Cat>.
Add 10 cats to the collection. The cat's name should be used as the key.
Display the result on the screen, each element on a new line.


Requirements:
1. The program should not read values from the keyboard.
2. In the addCatsToMap() method, declare a HashMap variable with (String, Cat) pairs and immediately initialize it.
3. The addCatsToMap() method should add all cats in the String[] cats array to the collection in accordance with the task conditions.
4. The program should display the contents of the collection on the screen,
each pair on a new line and with the key and value separated by a hyphen.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] cats = new String[]{"Tiger", "Missy", "Smokey", "Marmalade", "Oscar", "Snowball", "Boss", "Smudge", "Max", "Simba"};

        HashMap<String, Cat> map = addCatsToMap(cats);

        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }


    public static HashMap<String, Cat> addCatsToMap(String[] cats) {
        //write your code here
        HashMap<String, Cat> catHashMap = new HashMap<>();
        for (String name : cats) {
            catHashMap.put(name, new Cat(name));
        }
        return catHashMap;
    }


    public static class Cat {
        String name;

        public Cat(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name != null ? name.toUpperCase() : null;
        }
    }
}

package com.codegym.task.task08.task0802;

/* 
HashMap of 10 pairs
Create a HashMap<String, String>, and add 10 string pairs:
watermelon - melon,
banana - fruit,
cherry - fruit,
pear - fruit,
cantaloupe - melon,
blackberry - fruit,
ginseng - root,
strawberry - fruit,
iris - flower,
potato - tuber.
Display the contents of the collection, each element on a new line.

Example output: (here we just show one line):
potato - tuber


Requirements:
1. Declare a HashMap variable with (String, String) pairs and immediately initialize it.
2. The program should not read values from the keyboard.
3. The program should add 10 string pairs to the collection in accordance with the conditions.
4. The program should display the contents of the collection on the screen, each pair on a new line.

*/

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("watermelon", "melon");
        hashMap.put("banana", "fruit");
        hashMap.put("cherry", "fruit");
        hashMap.put("pear", "fruit");
        hashMap.put("cantaloupe", "melon");
        hashMap.put("blackberry", "fruit");
        hashMap.put("ginseng", "root");
        hashMap.put("strawberry", "fruit");
        hashMap.put("iris", "flower");
        hashMap.put("potato", "tuber");

        for (HashMap.Entry<String, String> pair : hashMap.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + " - " + value);
        }
    }
}

package com.codegym.task.task08.task0801;

/* 
HashSet of plants
Create a HashSet with String elements.
Add 10 strings to it:
watermelon
banana
cherry
pear
cantaloupe
blackberry
ginseng
strawberry
iris
potato

Display the contents of the collection, each element on a new line.
Watch how the order of the entries has changed.


Requirements:
1. Declare a HashSet variable with String elements and immediately initialize it.
2. The program should not read strings from the keyboard.
3. The program should add 10 strings to the collection in accordance with the conditions.
4. The program should display 10 strings from the collection, each on a new line.

*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("watermelon");
        hashSet.add("banana");
        hashSet.add("cherry");
        hashSet.add("pear");
        hashSet.add("cantaloupe");
        hashSet.add("blackberry");
        hashSet.add("ginseng");
        hashSet.add("strawberry");
        hashSet.add("iris");
        hashSet.add("potato");

        for (String str : hashSet) {
            System.out.println(str);
        }
    }
}

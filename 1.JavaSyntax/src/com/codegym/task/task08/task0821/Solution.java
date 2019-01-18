package com.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Shared last names and first names
1. Create a Map<String, String> and add 10 people represented by (last name, first name) pairs.
2. Among these 10 people, let there be people who share the same first names.
3. Among these 10 people, let there be people who share the same last names.
4. Display the contents of the Map on the screen.


Requirements:
1. The program should display text on the screen.
2. The Solution class must have only three methods.
3. The createPeopleList() method must create and return a Map with (String, String) elements. Also, add 10 people to the map.
4. In the createPeopleList() method, you need to add people with the same last name.
5. In the createPeopleList() method, you need to add people with the same first name.
6. The printPeopleList() method should display all people in the Map. Display each value on a new line. The last name and first name should be separated by a space.
7. The main() method should call the createPeopleList() method.
8. The main() method should call the printPeopleList() method.

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //write your code here
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            map.put("" + ((i + i) % 2), "" + ((i + i) % 3));
        }
        return map;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}

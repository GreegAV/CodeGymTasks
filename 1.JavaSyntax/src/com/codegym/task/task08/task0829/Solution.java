package com.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Software update
Task: The program determines which family (last name) lives in the house with the specified number.
New task: The program should work with cities rather than house numbers:

Example input:
Chicago
Capone
New York City
Rockefeller
Seattle
Gates

Seattle

Example output:
Gates

Requirements:
1. The program should display text on the screen.
2. The program should read values from the keyboard.
3. The Solution class must have one method.
4. The program should display the family's last name based on the entered city.

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String, String> map = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;

            String family = reader.readLine();
            map.put(family, city);
        }

        String cityFamily = reader.readLine();

        for (Map.Entry<String, String> m : map.entrySet()) {
            if (m.getValue().equals(cityFamily))
                System.out.println(m.getKey());
        }

    }
}
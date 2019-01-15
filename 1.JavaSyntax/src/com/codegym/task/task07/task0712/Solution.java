package com.codegym.task.task07.task0712;

import java.util.ArrayList;
import java.util.Scanner;

/* 
Shortest or longest
1. Create a list of strings.
2. Add 10 strings from the keyboard.
3. Find out which string occurs earlier in the list: the shortest or the longest.
If several strings are shortest or longest, then consider the very first such string encountered.
4. Display the string described in Step 3. One string should be displayed.


Requirements:
1. Declare a string list variable and immediately initialize it.
2. The program should read 10 strings from the keyboard and add them to the list.
3. The program should display the shortest string if it comes before the longest.
4. The program should display the longest string if it comes before the shortest.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strings.add(new Scanner(System.in).nextLine());
        }
        int numLongest = -1;
        int numShortest = -1;
        int longestLength = 0;
        int shortestLength = Integer.MAX_VALUE;
        for (int i = 0; i < strings.size(); i++) {
            String tmp = strings.get(i);
            if (tmp.length() > longestLength) {
                longestLength = tmp.length();
                numLongest = i;
            }
            if (tmp.length() < shortestLength) {
                shortestLength = tmp.length();
                numShortest = i;
            }
        }
        System.out.println(numLongest > numShortest ? strings.get(numShortest) : strings.get(numLongest));
    }
}

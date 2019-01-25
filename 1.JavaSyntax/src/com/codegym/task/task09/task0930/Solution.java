package com.codegym.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Task about algorithms
Task: The user enters a list of words (and numbers) from the keyboard.
The words are displayed in ascending order, the numbers in descending order.

Example input:
Cherry
1
Bob
3
Apple
22
0
Watermelon

Example output:
Apple
22
Bob
3
Cherry
1
0
Watermelon


Requirements:
1. The program must read data from the keyboard.
2. The program should display data on the screen.
3. The displayed words should be sorted in ascending order (using the provided isGreaterThan method).
4. The displayed numbers must be sorted in descending order.
5. The main method should use the sort method.
6. The sort() method should call the isGreaterThan() method.
7. The sort() method should call the isNumber() method.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // write your code here
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<String> strings = new ArrayList<>();
        for (String item : array) {
            if (isNumber(item))
                numbers.add(Integer.parseInt(item));
            else
                strings.add(item);
        }
        int nums[] = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            nums[i] = numbers.get(i);
        }
        String strs[] = new String[strings.size()];
        Arrays.sort(nums);
        strs = strings.toArray(strs);
        Arrays.sort(strs);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length - 1; j++) {
                if (isGreaterThan(strs[i], strs[j])) {
                    String s = strs[j];
                    nums[j] = nums[i];
                    strs[i] = s;
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            int j = i * 2;
            array[j] = strs[i];
            array[j + 1] = "" + nums[nums.length - i - 1];
        }
    }

    // String comparison method: 'a' is greater than 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Is the passed string a number?
    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // The string contains a hyphen
                    || (!Character.isDigit(c) && c != '-') // or is not a number and doesn't start with a hyphen
                    || (i == 0 && c == '-' && chars.length == 1)) // or is a single hyphen
            {
                return false;
            }
        }
        return true;
    }
}

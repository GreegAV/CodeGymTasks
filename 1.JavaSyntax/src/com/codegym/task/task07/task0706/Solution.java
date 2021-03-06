package com.codegym.task.task07.task0706;

/*
Streets and houses
1. Create an array of 15 integers.
2. Populate it with values ​​from the keyboard.
3. Let the array index represent the house number.
The array value at a particular index represents the number of people living in the corresponding house.
Houses with odd numbers are located on one side of the street. Those with even numbers are on the other side.
Find out which side of the street has more people living on it.
4. Display the following message: "Odd-numbered houses have more residents." or "Even-numbered houses have more residents."

Note:
the house at index 0 is considered even.

Requirements:
1. The program must create an array of 15 integers.
2. The program should read numbers for the array from the keyboard.
3. The program should display "Odd-numbered houses have more residents." if the sum of odd array elements is greater than the sum of even ones.
4. The program should display "Even-numbered houses have more residents." if the sum of even array elements is greater than the sum of odd ones.
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int[] ints = new int[15];
        int odds = 0, evens = 0;
        for (int i = 0; i < ints.length; i++) {
            ints[i] = new Scanner(System.in).nextInt();
            if (i % 2 == 0)
                evens += ints[i];
            else
                odds += ints[i];
        }
        if (evens > odds)
            System.out.println("Even-numbered houses have more residents.");
        else
            System.out.println("Odd-numbered houses have more residents.");
    }
}

package com.codegym.task.task07.task0701;

import java.io.IOException;
import java.util.Scanner;

/* 
Maximum in an array
1. In the initializeArray() method:
1.1. Create an array of 20 numbers
1.2. Read 20 numbers from the console and put them into the array
2. The max(int[] array) method must find the maximum of the array elements


Requirements:
1. The initializeArray method must create an array of 20 integers.
2. The initializeArray method must read in 20 numbers and return them as an array.
3. The max method must return the maximum element in the passed array.
4. Don't change the main method.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // Create and populate the array
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = new Scanner(System.in).nextInt();
        }
        return array;
    }

    public static int max(int[] array) {
        // Find the maximum
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
        }
        return max;
    }
}

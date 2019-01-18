package com.codegym.task.task08.task0822;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Minimum of N numbers
1. Use the keyboard to enter the number N.
2. Read N integers and put them in a list: the getIntegerList method.
3. Find the minimum among the list items: the getMinimum method.


Requirements:
1. The program should display text on the screen.
2. The program should read values from the keyboard.
3. The Solution class must have only three methods.
4. The getIntegerList() method should read the number N from the keyboard and then return a list of N elements,
which has been filled with numbers read from the keyboard.
5. The getMinimum() method must return the minimum among the list items.
6. The main() method should call the getIntegerList() method.
7. The main() method should call the getMinimum() method.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        // Find the minimum here
        int min = array.get(0);
        for (int tmp : array) {
            if (min > tmp)
                min = tmp;
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        // Create and initialize a list here
        int n = new Scanner(System.in).nextInt();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Scanner(System.in).nextInt());
        }
        return list;
    }
}

package com.codegym.task.task13.task1326;

/* 
Sorting even numbers from a file
1. Read a file name from the console.
2. Read a set of numbers from the file.
3. Display only the even numbers, sorted in ascending order.

Example input:
5
8
-2
11
3
-5
2
10

Example output:
-2
2
8
10


Requirements:
1. The program must read data from the console.
2. The program must create a FileInputStream using the line read from the console.
3. The program should display data on the screen.
4. The program should display all of the even numbers read from the file, sorted in ascending order.
5. The program must close the input stream used to read the file (FileInputStream).
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        //write your code here
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String filename = reader.readLine();
            FileInputStream fileInputStream = new FileInputStream(filename);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader file = new BufferedReader(inputStreamReader);
            ArrayList<Integer> arrayList = new ArrayList();
            while (file.ready()) {
                int num = Integer.parseInt(file.readLine());
                if (num % 2 == 0)
                    arrayList.add(num);
            }
            file.close();
            inputStreamReader.close();
            fileInputStream.close();
            reader.close();

            int[] ints = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                ints[i] = arrayList.get(i);
            }
            Arrays.sort(ints);
            for (int tmp : ints) {
                System.out.println(tmp);
            }
        } catch (Exception e) {
        }
    }
}

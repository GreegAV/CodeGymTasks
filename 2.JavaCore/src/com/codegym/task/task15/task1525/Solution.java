package com.codegym.task.task15.task1525;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
File in a static block
1. Initialize the variable Statics.FILE_NAME to the full path to a data file that contains several lines.
2. Then, in the static block, read all the lines from the file named Statics.FILE_NAME, and add them separately to the List lines.


Requirements:
1. The constant FILE_NAME must not be empty.
2. In the static block, all lines from the file named FILE_NAME must be added separately to the List lines.
3. he field FILE_NAME must NOT be final.
4. The Solution class must have a list of lines.

*/

public class Solution {
    public static List<String> lines = new ArrayList<>();

    static {
        try {
            BufferedReader freader = new BufferedReader(new InputStreamReader(new FileInputStream(Statics.FILE_NAME),
                    "UTF-8"));

            while (freader.ready()) {
                String s = freader.readLine();
                lines.add(s);
            }
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: File " + Statics.FILE_NAME + " not found!");
        } catch (IOException e) {
            System.out.println("ERROR: File " + Statics.FILE_NAME + " can't read!");
        }
    }

    public static void main(String[] args) {
        System.out.println(lines);
    }
}

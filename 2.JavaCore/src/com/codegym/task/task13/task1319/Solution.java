package com.codegym.task.task13.task1319;

import java.io.*;

/* 
Writing to a file from the console
1. Read a file name from the console.
2. Read lines from the console until the user enters the "exit".
3. Write all the entered lines to the file, each on a new line.


Requirements:
1. The program must read the file name from the console.
2. Create and use a BufferedWriter object.
3. The program should not read anything from the file system.
4. The program must read lines from the console until the user enters "exit".
5. The program must write absolutely all of the entered lines (including "exit") to the file, each on a new line.
6. The main method should close the BufferedWriter object after using it.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        BufferedWriter file = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(filename)));

        String s = "";
        while (!s.equals("exit")) {
            s = reader.readLine();
            file.write(s);
            file.newLine();
        }

        file.close();
        reader.close();
    }
}

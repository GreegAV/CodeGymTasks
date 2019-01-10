package com.codegym.task.task04.task0439;

/* 
Chain letter
Enter a name from the keyboard and use a for loop to display the following 10 times: <name> loves me.

Example output for the name "Scarlett":
Scarlett loves me.
Scarlett loves me.
Scarlett loves me.
Scarlett loves me.
Scarlett loves me.
Scarlett loves me.
Scarlett loves me.
Scarlett loves me.
Scarlett loves me.
Scarlett loves me.


Requirements:
1. The program should read the name from the keyboard.
2. The program should display text on the screen.
3. The program should display the text specified in the task 10 times.
4. The program must use a for loop.

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " loves me.");
        }

    }
}

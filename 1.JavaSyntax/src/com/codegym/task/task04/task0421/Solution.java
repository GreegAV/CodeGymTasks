package com.codegym.task.task04.task0421;

/* 
Jen or Jen?
Use the keyboard to enter two names. If the names are identical, display "The names are identical".
If the names are different, but they are the same length, display "The names are the same length".
If the names and name lengths are different, don't display anything.


Requirements:
1. The program should read two lines from the keyboard.
2. The program should contain System.out.println() or System.out.print().
3. If the names are identical, display "The names are identical"
4. If the names are different, but they are the same length, display "The names are the same length"
5. If the names and name lengths are different, don't display anything.
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.next();
        String name2 = scanner.next();
        if (name1.equalsIgnoreCase(name2))
            System.out.println("The names are identical");
        else if (name1.length() == name2.length())
            System.out.println("The names are the same length");
    }
}

package com.codegym.task.task04.task0443;


/* 
A name is a name
Use the keyboard to enter a name.
Use the keyboard to enter a birth date (three numbers): yyyy, mm, dd.

Display the following:
"My name is *name*.
I was born on mm/dd/yyyy"

Example output:
My name is Kevin.
I was born on 2/15/1988


Requirements:
1. The program should read 4 lines from the keyboard.
2. The program should display lines on the screen.
3. The program should display text in accordance with the template specified in the task.
4. Display each statement on a new line.

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int yyyy = scanner.nextInt();
        int mm = scanner.nextInt();
        int dd = scanner.nextInt();
        System.out.println("My name is " + name + ".");
        System.out.println("I was born on " + mm + "/" + dd + "/" + yyyy);
    }
}

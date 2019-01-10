package com.codegym.task.task04.task0419;

/* 
Maximum of four numbers
Use the keyboard to enter four numbers, and display the maximum of them.
If the numbers are equal to each other, display any of them.


Requirements:
1. The program should read the numbers from the keyboard.
2. The program must display a number on the screen.
3. The program should display the maximum of four numbers.
4. If there are several maximum numbers, display any of them.

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println(Math.max(Math.max(scanner.nextInt(), scanner.nextInt()), Math.max(scanner.nextInt(), scanner.nextInt())));
    }
}

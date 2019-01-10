package com.codegym.task.task04.task0436;


/* 
Drawing a rectangle
Use the keyboard to enter two numbers m and n.
Using a for loop, display an n x m rectangle made of eights.

Here's an example: m=2, n=4
8888
8888


Requirements:
1. The program should read two numbers from the keyboard.
2. The program should display text on the screen.
3. The program should display a n x m rectangle made of eights.
4. The program must use a for loop.

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("8");
            }
            System.out.println();
        }

    }
}

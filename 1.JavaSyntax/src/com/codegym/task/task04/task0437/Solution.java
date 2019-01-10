package com.codegym.task.task04.task0437;


/* 
Triangle of eights
Using a for loop, display a right triangle of eights, with a base of 10 and a height of 10.

Example of screen output:
8
88
888
8888
88888
888888
8888888
88888888
888888888
8888888888


Requirements:
1. The program should not read numbers from the keyboard.
2. The program should display numbers on the screen.
3. The program should display a right triangle of eights, with a base of 10 and a height of 10.
4. The program must use a for loop.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        for (int i = 1; i <=10 ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("8");
            }
            System.out.println();
        }

    }
}

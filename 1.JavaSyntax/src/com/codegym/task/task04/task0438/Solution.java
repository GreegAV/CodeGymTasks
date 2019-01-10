package com.codegym.task.task04.task0438;

/* 
Drawing lines
Using a for loop to display:
- a horizontal line of 10 eights
- a vertical line of 10 eights.


Requirements:
1. The program should not read numbers from the keyboard.
2. The program should display numbers on the screen.
3. The program should display a horizontal line of 10 eights.
4. The program should display a vertical line of 10 eights.
5. The program must use a for loop.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        for (int i = 0; i <10 ; i++) {
            System.out.print("8");
        }
        for (int i = 0; i <10 ; i++) {
            System.out.println("8");
        }

    }
}

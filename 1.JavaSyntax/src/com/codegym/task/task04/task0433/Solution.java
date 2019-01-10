package com.codegym.task.task04.task0433;

/* 
Seeing dollars in your future
Use a while loop to display a 10x10 square of dollar signs.
Don't separate the symbols in each line.

Example output:
$$$$$$$$$$
$$$$$$$$$$
$$$$$$$$$$
$$$$$$$$$$
$$$$$$$$$$
$$$$$$$$$$
$$$$$$$$$$
$$$$$$$$$$
$$$$$$$$$$
$$$$$$$$$$


Requirements:
1. The program should not read text from the keyboard.
2. The program should display text on the screen.
3. The program should display a 10x10 square of dollar signs.
4. The program must use a while loop.

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int ten=10;
        while (ten>0){
            System.out.println("$$$$$$$$$$");
            ten--;
        }

    }
}

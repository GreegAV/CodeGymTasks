package com.codegym.task.task03.task0322;


/* 
Deep and pure love
Use the keyboard to enter three names, then display:
name1 + name2 + name3 = Pure love. Ooo la-la!

For example:
Kevin + Eva + Angelica = Pure love. Ooo la-la!


Requirements:
1. The program should output text.
2. The program must read data from the keyboard.
3. The displayed text must contain the entered name1.
4. The displayed text must contain the entered name2.
5. The displayed text must contain the entered name3.
6. The displayed text must fully match the task conditions.

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scn = new Scanner(System.in);
        String name1 = scn.next();
        String name2 = scn.next();
        String name3 = scn.next();
        System.out.println(name1 + " + " + name2 + " + " + name3 + " = Pure love. Ooo la-la!");
    }
}
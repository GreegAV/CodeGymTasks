package com.codegym.task.task03.task0320;


/* 
The humble programmer
Use the keyboard to enter a name and display the following:
<name> makes $120,000 a year. Ha-ha-ha!

For example:
Sara makes $120,000 a year. Ha-ha-ha!


Requirements:
1. The program should output text.
2. The program must read data from the keyboard.
3. The displayed text must contain the entered name.
4. The displayed text must fully match the task conditions.

*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scn = new Scanner(System.in);
        System.out.println(scn.next()+" makes $120,000 a year. Ha-ha-ha!");
    }
}

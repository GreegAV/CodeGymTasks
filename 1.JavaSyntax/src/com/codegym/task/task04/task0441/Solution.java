package com.codegym.task.task04.task0441;

/* 
Somehow average
Use the keyboard to enter three numbers, and then display the middle number.
In other words, not the largest and not the smallest.
If all the numbers are equal, display any one of them.


Requirements:
1. The program should read the numbers from the keyboard.
2. The program must display a number on the screen.
3. The program should display the middle number of the three numbers.
4. If all the numbers are equal, display any one of them.
5. If two of the three numbers are equal, display either of the two.

*/
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner=new Scanner(System.in);
        int[] nums={scanner.nextInt(),scanner.nextInt(),scanner.nextInt()};
        Arrays.sort(nums);
        System.out.println(nums[1]);
    }
}

package com.codegym.task.task03.task0309;

/* 
Sum of 5 numbers
Display the sum of numbers from 1 to 5, line by line (there should be 5 lines):
1
1+2=3
1+2+3=6
...

Example output:
1
3
6
...

Requirements:
1. The program should output text.
2. The displayed text should contain 5 lines.
3. The number in each new line must be greater than the previous one.
4. The displayed text must match the task conditions.
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        int result=0;
        for (int i = 1; i <6 ; i++) {
            result+=i;
            System.out.println(result);
        }
    }
}

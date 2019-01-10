package com.codegym.task.task03.task0314;

/* 
Multiplication table
Display a 10 x 10 multiplication table in the following form:
1 2 3 4 …
2 4 6 8 …
3 6 9 12 …
4 8 12 16 …
…


Requirements:
1. The program should output text.
2. The displayed text should contain 10 lines.
3. Each displayed string must contain 10 numbers separated by spaces.
4. The displayed numbers must form a multiplication table.

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=10 ; j++) {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }
}

package com.codegym.task.task04.task0434;

/* 
Multiplication table
Use a while loop to display a 10x10 multiplication table.
Separate the numbers using a space.

Example output:
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
3 6 9 12 15 18 21 24 27 30
4 8 12 16 20 24 28 32 36 40
5 10 15 20 25 30 35 40 45 50
6 12 18 24 30 36 42 48 54 60
7 14 21 28 35 42 49 56 63 70
8 16 24 32 40 48 56 64 72 80
9 18 27 36 45 54 63 72 81 90
10 20 30 40 50 60 70 80 90 100


Requirements:
1. The program should not read text from the keyboard.
2. The program should display text on the screen.
3. The program should display a 10x10 multiplication table.
4. The program must use a while loop.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int count = 1;
        int count2=1;
        while (count < 11) {
            while (count2<11) {
                System.out.print(count*count2+" ");
                count2++;
            }
            System.out.println();
            count++;
            count2=1;
        }
    }
}

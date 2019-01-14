package com.codegym.task.task06.task0615;

/* 
Feng Shui and statics
Move one static modifier to make the example compile.


Requirements:
1. Don't change the main method.
2. Add the static modifier in the required location.
3. Remove the extra static modifier.
4. The program must have only 2 static modifiers.

*/

public class Solution {

    public static int A = 5;
    public int B = 2;
    public  int C = A * B;

    public static void main(String[] args) {
        A = 15;
    }
}

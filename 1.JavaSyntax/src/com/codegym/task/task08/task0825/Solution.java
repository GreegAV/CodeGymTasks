package com.codegym.task.task08.task0825;

/* 
Mixed-up modifier
Move one static modifier to make the example compile.


Requirements:
1. The Solution class must have a variable called A.
2. The Solution class must have a variable called B.
3. The Solution class must have a variable called C.
4. The Solution class must have a variable called D.
5. The Solution class must have only three methods.
6. The class must have 4 static modifiers (variables and methods).

*/

public class Solution {
    public static int A = 5;
    public static int B = 2;

    public int C = A * B;
    public static int D = B * A;

    public static void main(String[] args) {
    }

    public  int getValue() {
        return D;
    }

    public int getValue2() {
        return C;
    }
}


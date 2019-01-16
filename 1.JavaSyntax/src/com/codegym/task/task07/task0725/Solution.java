package com.codegym.task.task07.task0725;

/* 
Move one static modifier
Move one static modifier to make the example compile.


Requirements:
1. The program must not read data from the keyboard.
2. The class must have a variable A.
3. The class must have a variable B.
4. The class must have a variable C.
5. There must be a main method in the class.
6. There must be a getValue method in the class.
7. The class must have 4 static modifiers (variables and methods).

*/

public class Solution {
    public final static int A = 5;
    public final static int B = 2;
    public final static int C = A * B;

    public static void main(String[] args) {
    }

    public int getValue() {
        return C;
    }
}

package com.codegym.task.task01.task0131;

/* 
 More conversions
Implement the getFeetFromInches(int inches) method.
The method takes the number of inches.
Your task is to make the method return the number of full feet represented by the variable inches. (1 feet = 12 in).

Consider this example:
The getFeetFromInches method is called with the argument 243.

Example output:
20
Requirements:
1. The getFeetFromInches(int) method must be public and static.
2. The getFeetFromInches method must return an int.
3. The getFeetFromInches method should not display anything.
4. The getFeetFromInches method must correctly return the number of full feet represented by the variable inches.

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getFeetFromInches(28));
    }

    public static int getFeetFromInches(int inches) {
        //write your code here
        return inches/12;
    }
}
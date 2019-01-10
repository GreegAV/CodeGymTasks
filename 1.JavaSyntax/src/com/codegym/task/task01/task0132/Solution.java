package com.codegym.task.task01.task0132;

/* 
Sum of the digits of a three-digit number
Write the code for sumDigitsInNumber(int number).
The method takes a three-digit whole number.
You need to calculate the sum of the digits of this number, and then return the result.

Consider this example:
The sumDigitsInNumber method is called with the argument 546.

Example output:
15


Requirements:
1. The program must not read data from the keyboard.
2. The sumDigitsInNumber(int) method must be public and static.
3. The sumDigitsInNumber method must return an int.
4. The sumDigitsInNumber method should not display anything.
5. The sumDigitsInNumber method must return the sum of all digits in the parameter number.

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //write your code here
        return number/100+(number%100)/10+number%10;
    }
}
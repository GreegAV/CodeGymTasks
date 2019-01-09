package com.codegym.task.task03.task0308;

/* 
Product of 10 numbers
Display the product of the 10 numbers from 1 to 10.
The result is a single number.

Hint:
it will be three million and change.


Requirements:
1. The program must display an integer.
2. The main method should call the System.out.println method.
3. The displayed number should be more than three million.
4. The displayed number must match the task conditions.

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        int result=1;
        for (int i = 1; i <11 ; i++) {
            result*=i;
        }
        System.out.println(result);
    }
}

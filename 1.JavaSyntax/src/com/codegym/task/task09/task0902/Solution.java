package com.codegym.task.task09.task0902;

/* 
Stack trace revisited
Write five methods that call each other.
Each method should return the name of the method that called it. Use the stack trace to obtain this information.


Requirements:
1. There should be 5 methods in the class (in addition to the main method).
2. Each method should call the next: main calls method1, method1 calls method2, etc.
3. Each method must return the name of the method that called it.
4. To get the name of the calling method, use the getMethodName method.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();
        //write your code here
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method2() {
        method3();
        //write your code here
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method3() {
        method4();
        //write your code here
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method4() {
        method5();
        //write your code here
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

    public static String method5() {
        //write your code here
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }
}

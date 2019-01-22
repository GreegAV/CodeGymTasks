package com.codegym.task.task09.task0901;

/* 
Returning a stack trace
Write five methods that call each other.
Each method must return its stack trace.


Requirements:
1. There should be 5 methods in the class (in addition to the main method).
2. Each method should call the next: main calls method1, method1 calls method2, etc.
3. Each method must return its stack trace.
4. To get a stack trace, use Thread.currentThread().getStackTrace().

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
        //write your code here
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method2() {
        method3();
        //write your code here
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method3() {
        method4();
        //write your code here
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method4() {
        method5();
        //write your code here
        return Thread.currentThread().getStackTrace();
    }

    public static StackTraceElement[] method5() {
        //write your code here
        return Thread.currentThread().getStackTrace();
    }
}

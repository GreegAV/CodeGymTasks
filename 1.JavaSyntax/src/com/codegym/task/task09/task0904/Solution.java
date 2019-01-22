package com.codegym.task.task09.task0904;

/* 
Stack trace with 10 calls
Write the code to get a stack that is 10 calls deep. Don't change the main method.


Requirements:
1. There should be 10 methods in the class (in addition to the main method).
2. The variable stackTraceLength must end up being equal to 10.
3. Each method must call another method.
4. Use the Thread.currentThread().getStackTrace() method.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int stackTraceLength = method1().length - method10().length + 1;
    }

    public static StackTraceElement[] method1() {
        return method2();
    }

    public static StackTraceElement[] method2() {
        //write your code here
        return method3();
    }

    public static StackTraceElement[] method3() {
        //write your code here
        return method4();
    }

    public static StackTraceElement[] method4() {
        //write your code here
        return method5();
    }

    public static StackTraceElement[] method5() {
        //write your code here
        return method6();
    }

    public static StackTraceElement[] method6() {
        //write your code here
        return method7();
    }

    public static StackTraceElement[] method7() {
        //write your code here
        return method8();
    }

    public static StackTraceElement[] method8() {
        //write your code here
        return method9();
    }

    public static StackTraceElement[] method9() {
        return method10();
    }

    public static StackTraceElement[] method10() {
        return Thread.currentThread().getStackTrace();
    }
}

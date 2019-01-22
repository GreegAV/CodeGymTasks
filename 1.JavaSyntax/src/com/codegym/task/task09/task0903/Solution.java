package com.codegym.task.task09.task0903;

/* 
Who called me?
Write five methods that call each other.
Each method should return the line number of the code from which it was called.
Use the element.getLineNumber() method.


Requirements:
1. There should be 5 methods in the class (in addition to the main method).
2. Each method should call the next: main calls method1, method1 calls method2, etc.
3. Each method should return the line number of the code from which it was called.
4. To get the line number, use the getLineNumber method of the StackTraceElement class.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static int method1() {
        method2();
        return  /*write your code here*/  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method2() {
        method3();
        return  /*write your code here*/ Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method3() {
        method4();
        return  /*write your code here*/  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method4() {
        method5();
        return  /*write your code here*/  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method5() {
        return  /*write your code here*/ Thread.currentThread().getStackTrace()[2].getLineNumber();
    }
}

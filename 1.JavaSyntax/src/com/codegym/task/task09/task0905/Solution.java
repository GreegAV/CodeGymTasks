package com.codegym.task.task09.task0905;

/* 
In the blue depths of the stack trace…
Write a method that returns the stack trace depth, i.e. the number of methods in the stack trace.
The method should display this same number on the screen.


Requirements:
1. The getStackTraceDepth method must return the depth of its stack trace.
2. The getStackTraceDepth method should display the depth of its stack trace.
3. Use Thread.currentThread().getStackTrace().
4. The main method must call the getStackTraceDepth method.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int deep = getStackTraceDepth();
    }

    public static int getStackTraceDepth() {
        // write your code here
        System.out.println(Thread.currentThread().getStackTrace().length);
        return Thread.currentThread().getStackTrace().length;
    }
}


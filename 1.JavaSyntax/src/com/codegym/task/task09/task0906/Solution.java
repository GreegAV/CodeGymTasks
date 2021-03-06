package com.codegym.task.task09.task0906;

/* 
Logging stack traces
Implement the log method.
The log method should display the name of the class and method in which it is called, as well as the passed message.
Use a colon and space to separate the class name, method name, and message.

Example output:
com.codegym.task.task09.task0906.Solution: main: In main method


Requirements:
1. The log method must display a message on the screen.
2. The displayed message must contain the name of the class whose method called the log method.
3. The displayed message must contain the name of the method that called the log method.
4. The displayed message must contain the passed message.
5. The output must match the example from the task.

*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //write your code here
        StackTraceElement[] stackTraceElement=Thread.currentThread().getStackTrace();
        System.out.println(stackTraceElement[2].getClassName()+": "+stackTraceElement[2].getMethodName()+": "+s);
    }
}

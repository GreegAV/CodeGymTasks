package com.codegym.task.task03.task0312;

/* 
Time conversion
Add a public static int convertToSeconds(int hour) method that converts hours to seconds.
Call it twice in the main method with any arguments.
Display the results, each time on a new line.


Requirements:
1. Add the convertToSeconds method. It must be public static, and take and return ints.
2. The convertToSeconds method must convert the passed number of hours to seconds.
3. The main method must call the convertToSeconds method twice.
4. The main method should display the result of the calls, each time on a new line.
5. The convertToSeconds method should not display anything.

*/

public class Solution {
    //write your code here
    public static int convertToSeconds(int hour){
        return hour*3600;
    }

    public static void main(String[] args) {
        //write your code here
        System.out.println(convertToSeconds(2));
        System.out.println(convertToSeconds(5));
    }
}

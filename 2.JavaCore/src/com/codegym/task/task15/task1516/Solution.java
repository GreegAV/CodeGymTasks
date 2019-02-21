package com.codegym.task.task15.task1516;

/* 
Default values
1. Create 7 public fields for the class. Be sure they are initialized with default values.
int intVar
double doubleVar
Double DoubleVar
boolean booleanVar
Object ObjectVar
Exception ExceptionVar
String StringVar
2. In the main method, display their values in the specified order.


Requirements:
1. The Solution class must define an int field intVar.
2. The Solution class must define a double field doubleVar.
3. The Solution class must define a Double field DoubleVar.
4. The Solution class must define a boolean field booleanVar.
5. The Solution class must define an Object field ObjectVar.
6. The Solution class must define an Exception field ExceptionVar.
7. The Solution class must define a String field StringVar.
8. The main method should display the field values ​​on the screen
(each on a new line or separated by a space) in the specified order. You don't need to initialize variables.

*/

public class Solution {
    public int intVar;
    public double doubleVar;
    public Double DoubleVar;
    public boolean booleanVar;
    public Object ObjectVar;
    public Exception ExceptionVar;
    public String StringVar;

    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.println(solution.intVar);
        System.out.println(solution.doubleVar);
        System.out.println(solution.DoubleVar);
        System.out.println(solution.booleanVar);
        System.out.println(solution.ObjectVar);
        System.out.println(solution.ExceptionVar);
        System.out.println(solution.StringVar);
    }
}

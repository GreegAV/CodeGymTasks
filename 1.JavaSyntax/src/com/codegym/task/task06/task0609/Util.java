package com.codegym.task.task06.task0609;

/* 
Distance between two points
Implement the static double getDistance(x1, y1, x2, y2) method. It should calculate the distance between two points.
Use the double Math.sqrt(double a) method, which calculates the square root of the passed argument.


Requirements:
1. The getDistance method must return a double.
2. The getDistance method must be static.
3. The getDistance method must be public.
4. The getDistance method must return the distance between the points.
5. The getDistance method must use the double Math.sqrt(double a) method.

*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //write your code here
        return Math.sqrt(Math.pow((x2-x1),2)+ Math.pow((y2-y1),2));
    }

    public static void main(String[] args) {

    }
}

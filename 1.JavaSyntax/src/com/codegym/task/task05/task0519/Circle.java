package com.codegym.task.task05.task0519;

/* 
Walking in circles
Create the Circle class with three constructors:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color


Requirements:
1. The Circle class must have int variables centerX, centerY, radius, width and color.
2. The class must have a constructor that takes centerX, centerY, and radius as arguments, and initializes the corresponding instance variables.
3. The class must have a constructor that takes centerX, centerY, radius, and width as arguments, and initializes the corresponding instance variables.
4. The class must have a constructor that takes centerX, centerY, radius, width, and color as arguments, and initializes the corresponding instance variables.

*/


public class Circle {
    //write your code here
    int centerX, centerY, radius, width, color;

    public Circle(int centerX, int centerY, int radius) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
    }

    public Circle(int centerX, int centerY, int radius, int width) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
    }

    public Circle(int centerX, int centerY, int radius, int width, int color) {
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}

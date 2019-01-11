package com.codegym.task.task05.task0512;

/* 
Create a Circle class
Create the Circle class with three initializers:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color


Requirements:
1. The program must not read data from the keyboard.
2. The Circle class must have int variables centerX, centerY, radius, width and color.
3. The class must have an initialize method that takes centerX, centerY, and radius as arguments, and initializes the corresponding instance variables.
4. The class must have an initialize method that takes centerX, centerY, radius, and width as arguments, and initializes the corresponding instance variables.
5. The class must have an initialize method that takes centerX, centerY, radius, width, and color as arguments, and initializes the corresponding instance variables.

*/

public class Circle {
    //write your code here
    int centerX, centerY, radius, width, color;

    public void initialize(int x, int y, int r) {
        this.centerX = x;
        this.centerY = y;
        this.radius = r;
    }

    public void initialize(int x, int y, int r, int w) {
        this.centerX = x;
        this.centerY = y;
        this.radius = r;
        this.width = w;
    }

    public void initialize(int x, int y, int r, int w, int c) {
        this.centerX = x;
        this.centerY = y;
        this.radius = r;
        this.width = w;
        this.color = c;
    }

    public static void main(String[] args) {

    }
}

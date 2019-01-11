package com.codegym.task.task05.task0520;

/* 
Create a Rectangle class
Create a Rectangle class. The data for this class will be top, left, width, and height.
Create as many constructors as possible.

Here are some examples:
-	4 parameters are specified: left, top, width, height
-	width/height is not specified (both are 0)
-	height is not specified (it is equal to the width), we'll create a square
-	create a copy of another rectangle passed in as an argument


Requirements:
1. The Rectangle class must have int variables top, left, width and height.
2. The class must have at least one constructor.
3. The class must have at least two constructors.
4. The class must have at least three constructors.
5. The class must have at least four constructors.
*/


public class Rectangle {
    int top, left, width, height;
    //напишите тут ваш код

    public Rectangle(int left, int top, int width, int height) {
        this.top = top;
        this.height = height;
        this.left = left;
        this.width = width;

    }

    public Rectangle(int left, int top, int width) {
        this.top = top;
        this.height = width;
        this.left = left;
        this.width = width;

    }

    public Rectangle(int left, int top) {
        this.top = top;
        this.height = 0;
        this.left = left;
        this.width = 0;

    }

    public Rectangle(Rectangle rect) {
        this.top = rect.top;
        this.left = rect.left;
        this.width = rect.width;
        this.height = rect.height;

    }

    public static void main(String[] args) {

    }
}


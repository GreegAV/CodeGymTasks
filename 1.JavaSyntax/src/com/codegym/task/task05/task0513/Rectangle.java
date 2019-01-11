package com.codegym.task.task05.task0513;

/* 
Let's put together a rectangle
Create a Rectangle class. The data for this class will be top, left, width, height.
Create as many initialize(...) methods as possible

Here are some examples:
-	4 parameters are specified: left, top, width, and height
-	width/height is not specified (both are 0)
-	height is not specified (it is equal to the width), we'll create a square
-	create a copy of another rectangle passed as an argument


Requirements:
1. The program must not read data from the keyboard.
2. The Rectangle class must have int variables top, left, width and height.
3. The class must have at least one initialize method.
4. The class must have at least two initialize methods.
5. The class must have at least three initialize methods.
6. The class must have at least four initialize methods.

*/

public class Rectangle {
    //write your code here
    int top, left, width, height;

    public void initialize(int left, int top, int width, int height) {
        this.top = top;
        this.height = height;
        this.left = left;
        this.width = width;

    }

    public void initialize(int left, int top, int width) {
        this.top = top;
        this.height = width;
        this.left = left;
        this.width = width;

    }

    public void initialize(int left, int top) {
        this.top = top;
        this.height = 0;
        this.left = left;
        this.width = 0;

    }

    public void initialize(Rectangle rect) {
        this.top = rect.top;
        this.left = rect.left;
        this.width = rect.width;
        this.height = rect.height;

    }

    public static void main(String[] args) {

    }
}

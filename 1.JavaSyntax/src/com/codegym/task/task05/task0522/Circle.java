package com.codegym.task.task05.task0522;

/* 
Max constructors
Study the Circle class. Write the maximum number of possible constructors with different arguments.

Hint:
Don't forget about the default constructor.


Requirements:
1. The class must have at least three variables.
2. The class must have a default constructor.
3. The class must have at least one constructor.
4. The class must have at least two constructors.
5. The class must have at least three constructors.
6. The class must have at least four constructors.
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код

    public Circle(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;

    }

    public Circle(double x) {
        this.x = x;
        this.y = 0;
        this.radius = 0;
    }

    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
        this.radius = 0;
    }

    public Circle() {
        this(0, 0, 0);
    }

    public static void main(String[] args) {

    }
}
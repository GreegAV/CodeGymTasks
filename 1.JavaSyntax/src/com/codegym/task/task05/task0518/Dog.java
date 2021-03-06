package com.codegym.task.task05.task0518;

/* 
Dog registration
Create the Dog class with three constructors:
- Name
- Name, height
- Name, height, color


Requirements:
1. The Dog class must have a String variable name.
2. The Dog class must have an int variable height.
3. The Dog class must have a String variable color.
4. The class must have a constructor that takes a name as an argument and initializes the corresponding instance variable.
5. The class must have a constructor that takes a name and height as arguments, and initializes the corresponding instance variables.
6. The class must have a constructor that takes a name, height, and color as arguments, and initializes the corresponding instance variables.

*/


public class Dog {
    //write your code here
    String name;
    int height;
    String color;

    public Dog(String name) {
        this.name = name;
    }

    public Dog(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public Dog(String name, int height, String color) {
        this.name = name;
        this.color = color;
        this.height = height;
    }

    public static void main(String[] args) {

    }
}
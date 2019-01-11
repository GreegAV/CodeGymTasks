package com.codegym.task.task05.task0523;

/* 
Constructor
Figure out what the program does.
Find and fix one bug in the Circle class. Don't change the main method.

Hint:
study the default constructor.


Requirements:
1. The program must not read data from the keyboard.
2. Don't change the main method.
3. The program should display the word "Red" on the screen.
4. The Color class's getDescription method must return the value of the variable description.
5. The Color class's setDescription method must set the value of the variable description.
*/

public class Circle {
    public Color color;

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.color.setDescription("Red");
        System.out.println(circle.color.getDescription());
    }

    public Circle() {
        color = new Color();
    }

    public class Color {
        String description;

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }
    }
}

package com.codegym.task.task03.task0315;

/* 
Roy G. Biv…
Create 7 objects to display the 7 colors of the rainbow on the screen.
Example output:
Red
Orange
Yellow
Green
Blue
Indigo
Violet
Each object displays a specific color when it is created.


Requirements:
1. The program should output text.
2. You need to create 7 different objects responsible for the colors.
3. The order in which the objects are created must correspond to the order of the colors in the rainbow.
4. Don't change the classes responsible for the colors.
5. The displayed text must match the task conditions.

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Red red = new Red();
        Orange orange = new Orange();
        Yellow yellow = new Yellow();
        Green green = new Green();
        Blue blue = new Blue();
        Indigo indigo = new Indigo();
        Violet violet = new Violet();
    }

    public static class Red {
        public Red() {
            System.out.println("Red");
        }
    }

    public static class Orange {
        public Orange() {
            System.out.println("Orange");
        }
    }

    public static class Yellow {
        public Yellow() {
            System.out.println("Yellow");
        }
    }

    public static class Green {
        public Green() {
            System.out.println("Green");
        }
    }

    public static class Blue {
        public Blue() {
            System.out.println("Blue");
        }
    }

    public static class Indigo {
        public Indigo() {
            System.out.println("Indigo");
        }
    }

    public static class Violet {
        public Violet() {
            System.out.println("Violet");
        }
    }
}

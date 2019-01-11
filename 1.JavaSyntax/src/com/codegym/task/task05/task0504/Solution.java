package com.codegym.task.task05.task0504;


/* 
The Three "Muscateers"
In the main method, create three Cat objects and fill them with data.
Use the Cat class from the first task. You don't need to create the Cat class.


Requirements:
1. The program must not read data from the keyboard.
2. You need to create three Cat objects.
3. Don't change the Cat class.
4. The program should not display data on the screen.

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Cat cat1 = new Cat("Cat1", 1, 1, 1);
        Cat cat2 = new Cat("Cat2", 2, 2, 2);
        Cat cat3 = new Cat("Cat3", 3, 3, 3);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}
package com.codegym.task.task02.task0213;

/* 
Pets need people
Create Cat, Dog, Fish, and Woman objects.
Assign an owner to each animal.


Requirements:
1. The program should not display text on the screen.
2. In the main method, create Cat, Dog, Fish, and Woman objects, and store references to them in variables.
3. In the main method, set the Woman object as the owner of each animal.
4. The Cat, Dog, and Fish classes must have only one Woman variable named owner.
5. The Woman class must not have variables.

*/
public class Solution {
    public static void main(String[] args) {
        //write your code here
        Cat cat = new Cat();
        Dog dog = new Dog();
        Fish fish = new Fish();
        Woman woman = new Woman();
        cat.owner = woman;
        dog.owner = woman;
        fish.owner = woman;
    }

    public static class Cat {
        public Woman owner;
    }

    public static class Dog {
        public Woman owner;
    }

    public static class Fish {
        public Woman owner;
    }

    public static class Woman {
    }
}

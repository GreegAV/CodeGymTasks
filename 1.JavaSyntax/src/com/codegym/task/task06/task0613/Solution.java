package com.codegym.task.task06.task0613;

/* 
Cat and statics
In the Cat class, create a static public int variable catCount.
Declare a constructor, i.e. public Cat(). Each time a cat (new Cat object) is created,
increase the static variable catCount by 1.
Create 10 Cat objects and display the value of the variable catCount on the screen.


Requirements:
1. In the Cat class, create a static public int variable catCount.
2. In the Cat class, declare the public Cat() constructor with no parameters.
3. The constructor must increment the value of the static variable catCount by 1.
4. In the main method, create 10 cats.
5. In the main method, after creating all the cats, display the value of the variable catCount.

*/

public class Solution {
    public static void main(String[] args) {
        // Create 10 cats
        for (int i = 0; i < 10; i++) {
            new Cat();
        }
        // Display the value of the variable catCount
        System.out.println(Cat.catCount);
    }

    public static class Cat {
        // Create a static variable catCount
        public static int catCount;

        // Declare a constructor
        public Cat() {
            Cat.catCount++;

        }
    }
}

package com.codegym.task.task04.task0407;

/* 
Cats in the Universe
Write code to correctly count the number of cats created (count) and display the correct number of cats on the screen.


Requirements:
1. The program should display text on the screen.
2. Don't change the line responsible for screen output.
3. The Cat class must have only one count variable.
4. The Cat class's variable count must be a static int, have a public access modifier, and be initialized to zero.
5. The main method should have only two initialized Cat variables.
6. The variable count must store the actual number of cat objects created.

*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        //write your code here
        Cat.count++;

        Cat cat2 = new Cat();
        //write your code here
        Cat.count++;

        System.out.println("The cat count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }
}
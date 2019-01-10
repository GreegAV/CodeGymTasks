package com.codegym.task.task04.task0404;

/* 
Cat register
Write code in the addNewCat method to increase the number of cats by 1 each time it is called.
The variable catCount corresponds to the number of cats.


Requirements:
1. The Cat class must have only one catCount variable.
2. The variable catCount must be a static int, have a private access modifier, and be initialized to zero.
3. The Cat class must have two methods: addNewCat and main.
4. The Cat class's addNewCat method should increase the number of cats by 1.

*/

public class Cat {
    private static int catCount = 0;

    public static void addNewCat() {
        //write your code here
        Cat.catCount++;
    }

    public static void main(String[] args) {

    }
}

package com.codegym.task.task06.task0603;

/* 
Cat and Dog objects: 50,000 each
Create 50,000 each of Cat and Dog objects in a loop.
(The Java machine should start destroying unused objects, and the finalize method will be called at least once).


Requirements:
1. The Cat class must have a void finalize method.
2. The Dog class must have a void finalize method.
3. The Cat class's finalize method should display "A Cat was destroyed".
4. The Dog class's finalize method should display "A Dog was destroyed".
5. The main method must create 50,000 Cat objects and 50,000 Dog objects.

*/

public class Solution {
    public static void main(String[] args) {
        // write your code here
        for (int i = 0; i < 50000; i++) {
            Cat cat = new Cat();
            Dog dog = new Dog();
        }
    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Cat was destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("A Dog was destroyed");
    }
}

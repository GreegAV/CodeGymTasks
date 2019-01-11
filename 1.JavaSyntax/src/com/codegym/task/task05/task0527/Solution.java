package com.codegym.task.task05.task0527;

/* 
Tom and Jerry
Create Dog, Cat, and Mouse classes.
Add three fields of your choice to each class.
Create objects for the characters in the cartoon "Tom and Jerry".
You'll recall there are quite a few.

For example:
Mouse jerryMouse = new Mouse("Jerry", 5, 2),
where 5 is the height in inches,
and 2 is the length of his tail in inches.


Requirements:
1. Create a Dog class.
2. Create a Cat class.
3. The Dog class must have three variables.
4. The Cat class must have three variables.
5. You must create at least one Mouse object.
6. You must create at least one Dog object.
7. You must create at least one Cat object.

*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat kittyCat = new Cat("Kitty", 15, 6);
        Dog doggyDog = new Dog("Doggy", 25, 7);

        //write your code here
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        int height;
        int tail;

        public Cat(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Dog {
        String name;
        int height;
        int tail;

        public Dog(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    //write your code here
}

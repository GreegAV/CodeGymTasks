package com.codegym.task.task02.task0209;

/* 
Max, Bella, and Jack
Create 3 Dog objects.
Store each instance in a separate variable.
Give them the names "Max", "Bella", and "Jack".


Requirements:
1. The program should not display text on the screen.
2. The main method should have only three Dog variables.
3. The variables must be immediately assigned values.
4. Each Dog object must be assigned a name.
5. The Dog class must have a single variable called name.
6. The Dog class should not have methods.

*/
public class Solution {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Max";
        Dog dog2 = new Dog();
        dog2.name = "Bella";
        Dog dog3 = new Dog();
        dog3.name = "Jack";

        //write your code here
    }

    public static class Dog {
        public String name;
    }
}

package com.codegym.task.task05.task0526;

/* 
Man and woman
1. Inside the Solution class, create public static Man and Woman classes.
2. The classes must have the following fields: String name, int age, String address.
3. Make constructors that have all possible parameters.
4. Create two objects of each class with complete data using a constructor.
5. Display the objects on the screen in this format: name + " " + age + " " + address


Requirements:
1. In the Solution class, create a public static Man class.
2. In the Solution class, create a public static Woman class.
3. The Man class must have variables: String name, int age, and String address.
4. The Woman class must have variables: String name, int age, and String address.
5. The Man and Woman classes must have constructors that take String, int, and String arguments.
6. The constructors must initialize the instance variables.
7. In the main method, you need to create two objects of each type.
8. The main method should display the created objects on the screen in the specified format.

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Man man1 = new Man("Name1", 10, "Street1");
        Man man2 = new Man("Name2", 20, "Street2");
        Woman woman1 = new Woman("Name3", 30, "Street3");
        Woman woman2 = new Woman("Name4", 40, "Street4");
        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);

    }

    //write your code here
    public static class Woman {
        String name;
        int age;
        String address;

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }

    public static class Man {
        String name;
        int age;
        String address;

        @Override
        public String toString() {
            return name + " " + age + " " + address;
        }

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
    }
}

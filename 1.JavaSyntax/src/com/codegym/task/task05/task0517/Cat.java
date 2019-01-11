package com.codegym.task.task05.task0517;

/* 
Creating cats
Create the Cat class with five constructors:
- Name,
- Name, weight, age
- Name, age (standard weight)
- Weight, color (name, address, and age are unknown; the cat is homeless)
- Weight, color, address (someone else's pet)

The constructor's job is to make the object valid.
For example, if the weight is unknown, then you need to specify some average weight.
A cat can't weigh nothing.
The same applies to age. But there may or may not be a name (i.e. name might be null).
The same applies to the address (it might be null).


Requirements:
1. The Cat class must have a String variable name.
2. The Cat class must have an int variable age.
3. The Cat class must have an int variable weight.
4. The Cat class must have a String variable address.
5. The Cat class must have a String variable color.
6. The class must have a constructor that takes a name as an argument, but initializes all variables except the address.
7. The class must have a constructor that takes a name, weight, and age as arguments, and initializes all variables except the address.
8. The class must have a constructor that takes a name and age as arguments, and initializes all variables except the address.
9. The class must have a constructor that takes a weight and color as arguments, and initializes all variables except the name and address.
10. The class must have a constructor that takes a weight, color, and address as arguments, and initializes all variables except the name.

*/

public class Cat {
    //write your code here
    public String name;
    public int age;
    public int weight;
    public String address;
    public String color;

    public Cat(String name) {
        this.name = name;
        this.age = 5;
        this.weight = 2;
        this.color = "Blue";
        this.address = null;
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "Blue";
        this.address = null;
    }


    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 2;
        this.color = "Blue";
        this.address = null;
    }


    public Cat(int weight, String color) {
        this.name = null;
        this.age = 5;
        this.weight = weight;
        this.color = color;
        this.address = null;
    }


    public Cat(int weight, String color, String address) {
        this.name = null;
        this.age = 5;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
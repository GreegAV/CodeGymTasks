package com.codegym.task.task11.task1120;

/* 
Correct inheritance chain: part 5
Create a proper "inheritance chain" for the following classes: House, Cat, Dog, Car, Animal, and Asset.


Requirements:
1. The House class must inherit the Asset class.
2. The Cat class must inherit the Animal class.
3. The Dog class must inherit the Animal class.
4. The Car class must inherit the Asset class.
5. The Animal class must not inherit our other classes.
6. The Asset class must not inherit our other classes.

*/

public class Solution {
    public static void main(String[] args) {
    }

    public class House extends Asset{

    }

    public class Cat extends Animal {

    }

    public class Car extends Asset{

    }

    public class Dog extends Animal{

    }

    public class Animal {

    }

    public class Asset {

    }
}

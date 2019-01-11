package com.codegym.task.task05.task0515;

/* 
Initializing objects
Study the Person class carefully.
Correct the class so that only one initialize method initializes all of the Person class's instance variables.


Requirements:
1. The program must not read data from the keyboard.
2. The Person class must have 5 variables.
3. The class must have one initialize method.
4. The initialize method must have five parameters.

*/

public class Person {
    String name;
    char sex;
    int money;
    int weight;
    double size;

    public void initialize(String name, int money, char sex, int weight, double size) {
        this.name = name;
        this.money = money;
        this.sex = sex;
        this.weight = weight;
        this.size = size;
    }

    public static void main(String[] args) {

    }
}

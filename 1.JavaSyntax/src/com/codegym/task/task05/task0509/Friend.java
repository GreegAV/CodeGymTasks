package com.codegym.task.task05.task0509;

/* 
Create a Friend class
Create the Friend class with three initializers (three initialize methods):
- Name
- Name, age
- Name, age, sex

Note:
name is a String, age is an int, and sex is a char.


Requirements:
1. The Friend class must have a String variable name.
2. The Friend class must have an int variable age.
3. The Friend class must have a char variable sex.
4. The class must have an initialize method that takes a name as an argument and initializes the corresponding instance variable.
5. The class must have an initialize method that takes a name and age as arguments, and initializes the corresponding instance variables.
6. The class must have an initialize method that takes a name, age, and sex as arguments, and initializes the corresponding instance variables.

*/

public class Friend {
    //write your code here
    String name;
    int age;
    char sex;

    public void initialize(String name) {
        this.name = name;
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void initialize(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public static void main(String[] args) {

    }
}
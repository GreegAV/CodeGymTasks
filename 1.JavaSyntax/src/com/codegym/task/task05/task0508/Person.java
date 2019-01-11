package com.codegym.task.task05.task0508;

/* 
Getters and setters for the Person class
Create the Person class. A person should have a String name, int age, and char sex.
Create getters and setters for all the variables of the Person class.


Requirements:
1. The program must not read data from the keyboard.
2. The Person class must have a public static void main method.
3. The Person class should have 3 variables.
4. The Person class must have a String variable name.
5. The Person class must have an int variable age.
6. The Person class must have a char variable sex.
7. The class must have a setter for the variable name.
8. The class must have a getter for the variable name.
9. The class must have a setter for the variable age.
10. The class must have a getter for the variable age.
11. The class must have a setter for the variable sex.
12. The class must have a getter for the variable sex.
*/

public class Person {
    //write your code here
    String name;
    int age;
    char sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p3 = new Person();
        Person p2 = new Person();
    }
}

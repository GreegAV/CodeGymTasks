package com.codegym.task.task02.task0202;

/* 
Where does a Person come from?
In the Person class, declare the following variables: String name, int age, int weight, int money.
In the main method, create a Person object and store a reference to it in the variable person.

Hint: Use the following construct to create a Person object and assign a reference to that object to the variable person:
VariableType variableName = new TypeOfObjectBeingCreated();

Requirements:
1. In the Person class, declare a String variable called name.
2. In the Person class, declare an int variable called age.
3. In the Person class, declare an int variable called weight.
4. In the Person class, declare an int variable called money.
5. In the main method, create a Person object and immediately assign a reference to it to the variable person.
6. Five variables must be declared.

*/
public class Solution {
    public static void main(String[] args) {
        //write your code here
        Person person = new Person();
    }

    public static class Person {
        //write your code here
        String name;
        int age;
        int weight;
        int money;
    }
}

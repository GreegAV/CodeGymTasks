package com.codegym.task.task04.task0403;

/* 
What's the cat's name?
Help the cat get a name using the setName method.


Requirements:
1. The Cat class must contain only one variable called name.
2. The variable name must be a String and have a private access modifier.
3. The Cat class must have only two methods: setName and main.
4. The Cat class's setName method must set the value of the private String variable name equal to the passed String argument name.

*/

public class Cat {
    private String name = "nameless cat";

    public void setName(String name) {
        //write your code here
        this.name=name;
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setName("Simba");
        System.out.println(cat.name);
    }
}

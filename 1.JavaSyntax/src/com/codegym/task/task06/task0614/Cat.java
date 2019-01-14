package com.codegym.task.task06.task0614;

import java.util.ArrayList;

/* 
Static cats
1. In the Cat class, add the public static ArrayList<Cat> variable cats.
2. Each time a new cat (new Cat object) is created, add it to the variable cats. Create 10 Cat objects.
3. The printCats method should display all cats on the screen. You need to use the variable cats.


Requirements:
1. Add the public static ArrayList<Cat> variable cats to the Cat class.
2. The variable cats must be initialized.
3. The main method should create 10 Cat objects (use the Cat() constructor).
4. The main method must add all the created cats to the variable cats.
5. The printCats method should display all the cat objects in the variable cats. Each on a new line.

*/

public class Cat {
    //write your code here
    public static ArrayList<Cat> cats=new ArrayList<>();

    public Cat() {
    }

    public static void main(String[] args) {
        //write your code here
        for (int i = 0; i < 10; i++) {
            cats.add(new Cat());
        }
        printCats();
    }

    public static void printCats() {
        //write your code here
        for (Cat cat : cats) {
            System.out.println(cat.toString());
        }
    }
}

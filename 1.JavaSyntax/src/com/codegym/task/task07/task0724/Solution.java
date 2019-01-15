package com.codegym.task.task07.task0724;

/* 
Family census
Create the Human class with String name, boolean sex, int age, Human father, and Human mother fields.
Create and populate objects so that we end up with:
Two grandfathers, two grandmothers, one father, one mother, and three children.
Display the objects on the screen.

Note:
If you write your own String toString() method in the Human class, then it will be used to display the object on the screen.

Example output:
Name: Anna, sex: female, age: 21, father: Paul, mother: Kate
Name: Kate, sex: female, age: 55
Name: Ben, sex: male, age: 2, father: Michael, mother: Anna
…


Requirements:
1. The program must not read data from the keyboard.
2. Add the following fields to the Human class: String name, boolean sex, int age, Human father, and Human mother.
3. Add a constructor: public Human(String name, boolean sex, int age).
4. Add a constructor: public Human(String name, boolean sex, int age, Human father, Human mother).
5. Create 9 different Human objects (4 objects without a father and mother and 5 objects with them).
6. Display all the created objects on the screen.

*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        // write your code here
        ArrayList<Human> humans = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            humans.add(new Human("Name" + i, i % 2 == 0, i + 40));
        }
        for (int i = 0; i < 2; i++) {
            humans.add(new Human("Name" + i + 4, i % 2 == 0, i + 20, humans.get(humans.size() - 4+i), humans.get(humans.size()+i-3)));
        }
        for (int i = 0; i < 3; i++) {
            humans.add(new Human("Name" + i + 4, i % 2 == 0, i + 20, humans.get(4), humans.get(5)));
        }
        for (Human human : humans) {
            System.out.println(human);
        }
    }

    public static class Human {
        // write your code here
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null)
                text += ", father: " + this.father.name;

            if (this.mother != null)
                text += ", mother: " + this.mother.name;

            return text;
        }
    }
}
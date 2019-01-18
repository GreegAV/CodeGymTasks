package com.codegym.task.task08.task0824;

/* 
Make a family
1. Create a Human class with String name, boolean sex, int age, and ArrayList<Human> children fields.
2. Create and populate objects so that we end up with:
two grandfathers, two grandmothers, one father, one mother, and three children.
3. Display all the Human objects (Hint: use the Human class's toString() method).


Requirements:
1. The program should display text on the screen.
2. The Human class must have four fields.
3. The Human class must have one method.
4. The Solution class must have one method.
5. The program should create objects and fill them with data to get two grandfathers,
two grandmothers, one father, one mother, and three children. Then it should display all the Human objects on the screen.

*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //write your code here
        ArrayList<Human> children = new ArrayList<>();
        //дети
        Human child1 = new Human("child1", true, 2, new ArrayList<>());
        Human child2 = new Human("child2", true, 3, new ArrayList<>());
        Human child3 = new Human("child3", false, 4, new ArrayList<>());

        children.add(child1);
        children.add(child2);
        children.add(child3);

        //родители
        Human mother = new Human("mother", false, 21, children);
        Human father = new Human("father", true, 26, children);

        //родители матери
        ArrayList<Human> chidrenParent1 = new ArrayList<>();
        chidrenParent1.add(mother);
        Human grandMother1 = new Human("grandMother1", false, 55, chidrenParent1);
        Human grandFather1 = new Human("grandFather1", true, 56, chidrenParent1);

        //родители отца
        ArrayList<Human> chidrenParent2 = new ArrayList<>();
        chidrenParent2.add(father);
        Human grandMother2 = new Human("grandMother2", false, 60, chidrenParent2);
        Human grandFather2 = new Human("grandFather2", true, 66, chidrenParent2);

        System.out.println(grandMother1.toString());
        System.out.println(grandFather1.toString());
        System.out.println(grandMother2.toString());
        System.out.println(grandFather2.toString());
        System.out.println(mother.toString());
        System.out.println(father.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());

    }

    public static class Human {
        //write your code here
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}

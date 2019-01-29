package com.codegym.task.task10.task1013;

/* 
Human class constructors
Write a Human class with 6 fields.
Think up and implement 10 different constructors for it.
Each constructor should make sense.


Requirements:
1. The program must not read data from the keyboard.
2. There should be 6 fields in the Human class.
3. All of the Human class's fields must be private.
4. There should be 10 constructors in the Human class.
5. All of the Human class's constructors must be public.

*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Write your variables and constructors here
        private String firstName;
        private String lastName;
        private int age;
        private boolean sex;
        private long inn;
        private ArrayList<Human> children;

        public Human(String firstName, String lastName, boolean sex, ArrayList<Human> children) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.children = children;
        }

        public Human(String firstName, String lastName, int age, long inn) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.inn = inn;
        }

        public Human(String firstName, String lastName, boolean sex, long inn) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.sex = sex;
            this.inn = inn;
        }

        public Human() {
        }

        public Human(String firstName, String lastName, int age, boolean sex, long inn, ArrayList<Human> children) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.inn = inn;
            this.children = children;
        }

        public Human(String firstName, String lastName, int age, boolean sex, long inn) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.inn = inn;
        }

        public Human(String firstName, String lastName, int age, boolean sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
        }

        public Human(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public Human(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public Human(String firstName) {
            this.firstName = firstName;
        }
    }
}

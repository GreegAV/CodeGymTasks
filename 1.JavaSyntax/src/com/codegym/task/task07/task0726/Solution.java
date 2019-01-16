package com.codegym.task.task07.task0726;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Cat code won't compile
Task: The program reads data about cats from the keyboard and displays it on the screen.

For example:
Cat's name: Tiger, age: 6, weight: 5, tail: 22
Cat's name: Missy, age: 8, weight: 7, tail: 20

Requirements:
1. The program must read data from the keyboard.
2. If the user enters an empty string instead of a name, the program should display the data on the screen and terminate.
3. If the user enters: Tiger, 6, 5 and 22 (each value on a new line),
then the program should display "Cat's name: Tiger, age: 6, weight: 5, tail: 22".
4. If the user enters: Missy, 8, 7 and 20 (each value on a new line),
then the program should display "Cat's name: Missy, age: 8, weight: 7, tail: 20".
5. If the user enters: Tiger, 6, 5, 22, Missy, 8, 7 and 20 (each value on a new line),
then the program should display two lines:
"Cat's name: Tiger, age: 6, weight: 5, tail: 22" and
"Cat's name: Missy, age: 8, weight: 7, tail: 20".

*/

public class Solution {
    public static ArrayList<Cat> CATS = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String name = reader.readLine();
            if (name.isEmpty()) break;
            int age = Integer.parseInt(reader.readLine());
            int weight = Integer.parseInt(reader.readLine());
            int tail = Integer.parseInt(reader.readLine());

            Cat cat = new Cat(name, age, weight, tail);
            CATS.add(cat);
        }

        printList();
    }

    public static void printList() {
        for (Cat cat : CATS) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int tailLength;

        Cat(String name, int age, int weight, int tailLength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }

        @Override
        public String toString() {
            return "Cat's name: " + name + ", age: " + age + ", weight: " + weight + ", tail: " + tailLength;
        }
    }
}
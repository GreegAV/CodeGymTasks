package com.codegym.task.task08.task0820;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Animal set
1. Inside the Solution class, create public static classes Cat and Dog.
2. Implement the createCats method, which should return a set with 4 cats.
3. Implement the createDogs method, which should return a set with 3 dogs.
4. Implement the join method, which should return a combined set of all the animals (all the cats and dogs).
5. Implement the removeCats method, which should remove from the set pets all cats in the set cats.
6. Implement the printPets method, which should display all the animals in the set pets.
Each animal should be on a new line.


Requirements:
1. The program should display text on the screen.
2. There should be public static classes Cat and Dog inside the Solution class.
3. The Solution class's createCats() method must return a Set containing 4 cats.
4. The Solution class's createDogs() method must return a Set containing 3 dogs.
5. The Solution class's join() method should return a combined set of all the animals (all the cats and dogs).
6. The removeCats() method should remove from the set pets all cats in the set cats.
7. The printPets() method should display all the animals in the set pets. Each animal should be on a new line.

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> catHashSet = new HashSet<Cat>();
        //write your code here
        for (int i = 0; i < 4; i++) {
            catHashSet.add(new Cat());
        }
        return catHashSet;
    }

    public static Set<Dog> createDogs() {
        //write your code here
        HashSet<Dog> dogHashSet = new HashSet<Dog>();
        for (int i = 0; i < 3; i++) {
            dogHashSet.add(new Dog());
        }
        return dogHashSet;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        //write your code here
        HashSet<Object> animals = new HashSet<>();
        for (Cat cat : cats) {
            animals.add(cat);
        }
        for (Dog dog : dogs) {
            animals.add(dog);
        }

        return animals;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        //write your code here
        Iterator<Object> iterator = pets.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() instanceof Cat)
                iterator.remove();
        }
    }

    public static void printPets(Set<Object> pets) {
        //write your code here
        Iterator<Object> iterator = pets.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //write your code here
    public static class Cat {
    }

    public static class Dog {
    }
}

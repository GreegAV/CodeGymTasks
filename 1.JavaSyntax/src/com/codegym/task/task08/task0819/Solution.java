package com.codegym.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set of cats
1. Inside the Solution class, create a public static Cat class.
2. Implement the createCats method. It must create a Set of cats and add 3 cats to it.
3. In the main method, remove one cat from Set cats.
4. Implement the printCats method. It should display all the cats that remain in the set.
Each cat on a new line.


Requirements:
1. The program should display text on the screen.
2. Inside the Solution class, there must be a public static Cat class with a default constructor.
3. The Solution class's createCats() method must return a Set containing 3 cats.
4. The Solution class's printCats() method must display all the cats in the set. Each cat on a new line.
5. The main() method should call the createCats() method once.
6. The main() method should call the printCats() method.
7. The main() method must remove one cat from the set of cats.

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        //write your code here. step 3
        int count = 0;
        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()) {
            Cat cat = iterator.next();
            if (count == cats.size() / 2) {
                cats.remove(cat);
                break;
            }
            count++;
        }
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //write your code here. step 2
        Set<Cat> catSet = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            catSet.add(new Cat("" + i));
        }
        return catSet;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4
        Iterator<Cat> iterator = cats.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    // step 1
    public static class Cat {
        String name;

        public Cat() {
        }

        public Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}

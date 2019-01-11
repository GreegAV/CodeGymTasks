package com.codegym.task.task05.task0505;

/* 
Feline carnage
Use the Cat class to create three cats.
Hold three pairwise battles between the cats.
You don't need to create the Cat class. For combat, use the boolean fight (Cat anotherCat) method.
Display the result of each battle on the screen on a new line.


Requirements:
1. The program must not read data from the keyboard.
2. You need to create three Cat objects.
3. You need to conduct three fights.
4. The program should display the result of each battle on a new line.
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Cat cat1 = new Cat("Cat1", 1, 1, 1);
        Cat cat2 = new Cat("Cat2", 2, 2, 2);
        Cat cat3 = new Cat("Cat3", 3, 3, 3);
        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat3));
        System.out.println(cat3.fight(cat1));
    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
            int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
            int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

            int score = ageAdvantage + weightAdvantage + strengthAdvantage;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}

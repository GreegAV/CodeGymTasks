package com.codegym.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Cat relations
Task: Each cat has a name and a mother.
Create a class that describes this situation.
Create two objects: a daughter cat and a mother.
Display them on the screen.

New task: Each cat has a name, a father, and a mother.
Edit Cat so that it reflects these relationships.
Create 6 objects: grandfather (the father's father), grandmother (the mother's mother), father, mother, son, daughter.
Display them all in the following order: grandfather, grandmother, father, mother, son, daughter.

Example input:
Grandfather Tiger
Grandmother Puss
Father Oscar
Mother Missy
Son Simba
Daughter Coco

Example output:
The cat's name is Grandfather Tiger, no mother, no father
The cat's name is Grandmother Puss, no mother, no father
The cat's name is Father Oscar, no mother, Grandfather Tiger is the father
The cat's name is Mother Missy, Grandmother Puss is the mother, no father
The cat's name is Son Simba, Mother Missy is the mother, Father Oscar is the father
The cat's name is Daughter Coco, Mother Missy is the mother, Father Oscar is the father


Requirements:
1. The program should read in the names of 6 cats in the specified order.
2. The main method should create 6 Cat objects.
3. The program should display 6 lines with information about the cats.
4. The line about the grandfather (first line) must match the conditions.
5. The line about the grandmother (second line) must match the conditions.
6. The line about the father (third line) must match the conditions.
7. The line about the mother (fourth line) must match the conditions.
8. The line about the son (fifth line) must match the conditions.
9. The line about the daughter (sixth line) must match the conditions.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String dedVasyaName = reader.readLine();
        Cat dedVasya = new Cat(dedVasyaName);

        String babaMurkaName = reader.readLine();
        Cat babaMurka = new Cat(babaMurkaName);

        String papaKotofeyName = reader.readLine();
        Cat papaKotofey = new Cat(papaKotofeyName, null, dedVasyaName);

        String mamaVasilisaName = reader.readLine();
        Cat mamaVasilisa = new Cat(mamaVasilisaName, babaMurkaName, null);

        String sonMurchikName = reader.readLine();
        Cat sonMurchik = new Cat(sonMurchikName, mamaVasilisaName, papaKotofeyName);

        String daughterPushinkaName = reader.readLine();
        Cat daughterPushinka = new Cat(daughterPushinkaName, mamaVasilisaName, papaKotofeyName);

        System.out.println(dedVasya.toString());
        System.out.println(babaMurka.toString());
        System.out.println(papaKotofey.toString());
        System.out.println(mamaVasilisa.toString());
        System.out.println(sonMurchik.toString());
        System.out.println(daughterPushinka.toString());
    }

    public static class Cat {
        private String name;
        private String mother;
        private String father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, String mother, String father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }


        @Override
        public String toString() {
            if ((mother == null) && (father == null)) {
                return "The cat's name is " + name + ", no mother, no father ";
            }
            if (mother == null) {
                return "The cat's name is " + name + ", no mother, " + father + " is the father";
            }
            if (father == null) {
                return "The cat's name is " + name + ", " + mother + " is the mother, no father";
            }
            return "The cat's name is " + name + ", " + mother + " is the mother, " + father + " is the father";
        }
    }

}
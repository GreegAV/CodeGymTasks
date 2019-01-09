package com.codegym.task.task03.task0307;

/* 
Hello, StarCraft!
Create 5 Zerg units, 3 Protoss units and 4 Terran units.
Give them all unique names.


Requirements:
1. Don't change the Zerg, Protoss, and Terran classes.
2. Create 5 Zerg objects and name each of them.
3. Create 3 Protoss objects and name each of them.
4. Create 4 Terran objects and name each of them.

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Zerg zerg0 = new Zerg();
        zerg0.name = "Zerg0";
        Zerg zerg1 = new Zerg();
        zerg1.name = "Zerg1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "Zerg2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "Zerg3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "Zerg4";

        Protoss protoss1 = new Protoss();
        protoss1.name = "Protoss1";
        Protoss protoss2 = new Protoss();
        protoss2.name = "Protoss2";
        Protoss protoss3 = new Protoss();
        protoss3.name = "Protoss3";

        Terran terran0 = new Terran();
        terran0.name = "Terran0";
        Terran terran1 = new Terran();
        terran1.name = "Terran1";
        Terran terran2 = new Terran();
        terran2.name = "Terran2";
        Terran terran3 = new Terran();
        terran3.name = "Terran3";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}

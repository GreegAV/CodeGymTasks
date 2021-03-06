package com.codegym.task.task12.task1212;

/* 
"Fix the code", part 1
Correct the code so the program will compile.

Hint:
The getChild method must remain abstract.


Requirements:
1. The Pet class must be static.
2. The Pet class must have two methods.
3. The getChild() method must be abstract.
4. The Pet class must be declared with a modifier that prevents the creation of objects of this class.

*/

public class Solution {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public String getName() {
            return "I'm a kitten";
        }

        public abstract Pet getChild();
    }
}

package com.codegym.task.task06.task0607;

/* 
Class counter
Declare a static int variable catCount in the Cat class.
Declare a constructor, i.e. public Cat(), that increases this variable by 1.


Requirements:
1. Add a constructor to the Cat class.
2. The constructor must be public.
3. Add the catCount field to the Cat class.
4. The catCount field must be an int.
5. The catCount field must be static.
6. The constructor must increment the value of the variable catCount by 1.

*/

public class Cat {
    //write your code here
    static int catCount;

    public Cat() {
        catCount++;
    }

    public static void main(String[] args) {

    }
}

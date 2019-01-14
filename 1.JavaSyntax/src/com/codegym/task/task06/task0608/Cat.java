package com.codegym.task.task06.task0608;

/* 
Static methods for cats
Add two static methods to the Cat class: int getCatCount() and setCatCount(int),
which you can use to get/change the number of cats (variable catCount).


Requirements:
1. Add the getCatCount method to the class.
2. The getCatCount method must return an int.
3. The getCatCount method must return the value of the variable catCount.
4. Add a setCatCount method that takes an int to the class.
5. The setCatCount method should not return anything.
6. The setCatCount method must set the variable catCount to the passed value.

*/

public class Cat {
    private static int catCount = 0;

    public Cat() {
        catCount++;
    }

    public static int getCatCount() {
        //write your code here
        return catCount;
    }

    public static void setCatCount(int catCount) {
        //write your code here
        Cat.catCount = catCount;
    }

    public static void main(String[] args) {

    }
}

package com.codegym.task.task12.task1224;

/* 
Unknown animal
Write a method that will determine the type of object passed to it.
The program should display one of the following:
"Cat", "Tiger", "Lion", "Bull", or "Animal".


Requirements:
1. The Solution class must have Cat, Tiger, Lion, Bull, and Pig classes.
2. The Solution class must have a String getObjectType(Object o) method.
3. The getObjectType() method must return "Cat" if a Cat object is passed.
4. The getObjectType() method must return "Tiger" if a Tiger object is passed.
5. The getObjectType() method must return "Lion" if a Lion object is passed.
6. The getObjectType() method must return "Bull" if a Bull object is passed.
7. The getObjectType() method must return "Animal" if any other object is passed.
8. The program should display the result of calling the getObjectType() method.

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //write your code here
        String className = o.getClass().getSimpleName();
        return className.equals("Cat") ? "Cat" :
                className.equals("Tiger") ? "Tiger" :
                        className.equals("Lion") ? "Lion" :
                                className.equals("Bull") ? "Bull" :
                                        className.equals("Pig") ? "Pig" :
                                                "Animal";
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}

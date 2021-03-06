package com.codegym.task.task12.task1229;

/* 
Parent of the CTO class
Add a parent class to the CTO class so that the class isn't abstract.
You can't add or implement any methods in the CTO class.


Requirements:
1. The Solution class must have a Businessman interface with a void workHard() method.
2. The Solution class must have a non-abstract CTO class.
3. The CTO class must implement the Businessman interface.
4. The CTO class must not have any methods.
5. The Solution class must have one additional class.
6. The CTO class must inherit the additional class.
7. The additional class must have one method.
*/

public class Solution {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class Employee implements Businessman {
        @Override
        public void workHard() {

        }
    }

    public static class CTO extends Employee implements Businessman {


    }
}

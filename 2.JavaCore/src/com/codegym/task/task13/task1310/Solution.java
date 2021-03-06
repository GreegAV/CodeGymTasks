package com.codegym.task.task13.task1310;

/* 
Who's that smarty?
1. Add the Secretary and Boss interfaces to the CleverMan and SmartGirl classes.
One interface for each class. Think about which interface should go to each class.
2. Make the Secretary and Boss interfaces inherit the Person and CanWork interfaces so
that all of the methods in the CleverMan and SmartGirl classes are declared in one of the interfaces.


Requirements:
1. The CleverMan class must implement the appropriate interface (Secretary or Boss).
2. The SmartGirl class must implement the appropriate interface (Secretary or Boss).
3. A Secretary is a Person.
4. A Boss is a Person who enjoys working hard (CanWork).
*/

public class Solution {
    public static void main(String[] args) {
    }

    interface Person {
        void use(Person person);

        void startToWork();
    }

    interface CanWork {
        boolean wantsToGetExtraWork();
    }

    interface Secretary extends Person, CanWork {
    }

    interface Boss extends Person, CanWork  {
    }

    class CleverMan implements Boss {
        public void use(Person person) {
            person.startToWork();
        }

        public void startToWork() {
        }

        public boolean wantsToGetExtraWork() {
            return true;
        }
    }

    class SmartGirl implements Secretary {
        public void use(Person person) {
        }

        public void startToWork() {
        }

        @Override
        public boolean wantsToGetExtraWork() {
            return false;
        }
    }
}

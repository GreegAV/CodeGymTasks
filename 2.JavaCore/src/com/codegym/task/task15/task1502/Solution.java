package com.codegym.task.task15.task1502;

/* 
OOP: Animal inheritance
1. Create a public static Goose class.
2. Create a public static Dragon class.
3. Make the Goose class inherit either BigAnimal or SmallAnimal. Think about which would be more logical.
4. Make the Dragon class inherit either BigAnimal or SmallAnimal. Think about which would be more logical.
5. Make the Goose and Dragon classes override the String getSize() method and make its visibility as wide as possible.
6. In the Goose class, the getSize method should return "A goose is small, " + <parent class>.getSize().
7. In the Dragon class, the getSize method should return "A dragon is big, " + <parent class>.getSize().


Requirements:
1. The Goose class must be inside the Solution class and must be static.
2. The Dragon class must be inside the Solution class and must be static.
3. The Goose class must be a descendant of the SmallAnimal class.
4. The Dragon class must be a descendant of the BigAnimal class.
5. In the Goose class, the getSize method must be overridden. It should return a string formatted as follows: "A goose is small, " + <parent class>.getSize().
6. In the Dragon class, the getSize method must be overridden. It should return a string formatted as follows: "A dragon is big, " + <parent class>.getSize().
7. The visibility of the overridden getSize methods in the Goose and Dragon classes must be made as wide as possible.

*/

public class Solution {
    // Add the Goose and Dragon classes here
    public static class Goose extends SmallAnimal {
        @Override
        public String getSize() {
            return "A goose is small, " + super.getSize();
        }
    }

    public static class Dragon extends BigAnimal {
        @Override
        public String getSize() {
            return "A dragon is big, " + super.getSize();
        }
    }

    public static void main(String[] args) {

    }

    public static class BigAnimal {
        protected String getSize() {
            return "like a dinosaur";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "like a cat";
        }
    }
}

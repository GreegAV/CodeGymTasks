package com.codegym.task.task13.task1312;

/* 
Code doesn't fix itself
Fix the code so that the program runs and displays "I translate from Russian".
Don't change the main method!


Requirements:
1. The program should display "I translate from Russian".
2. The translate method should return "I translate from Russian".
3. The program must run without errors.
4. The main method must display the result of calling the Translator object's translate method.
*/

public class Solution {
    public static void main(String[] args) {
        Translator translator = new Translator();
        System.out.println(translator.translate());
    }

    public  static class Translator {
        public String translate() {
            return "I translate from Russian";
        }
    }


}
package com.codegym.task.task06.task0617;

/* 
Notepad for new ideas
1. In the Solution class, create the public static Idea class
2. In the Idea class, declare a public String getDescription() method that returns any non-empty string
3. In the Solution class, create a static public void printIdea(Idea idea) method that will display
a description of the idea (what the getDescription method returns)


Requirements:
1. In the Solution class, create the public static Idea class.
2. In the Idea class, create the public String getDescription() method.
3. The getDescription method must return any non-empty string.
4. In the Solution class, create a public static void printIdea(Idea idea) method.
5. The printIdea method should display the idea description on the screen.

*/

public class Solution {
    public static void main(String[] args) {
        printIdea(new Idea());
    }

    //write your code here
    public static class Idea {
        public String getDescription() {
            return "Hello World!";
        }
    }
    public static void printIdea(Idea idea){
        System.out.println(idea.getDescription());
    }
}

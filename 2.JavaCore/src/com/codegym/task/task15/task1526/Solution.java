package com.codegym.task.task15.task1526;

/* 
Debug, debug, and again debug
The program displays 0 9, but it should display 6 9. Find (one!) mistake and correct.
Use the debugger. Set ,breakpoints (Ctrl+F8), and then go to Run -> Debug.
F9 will execute code until the next breakpoint
F8 will step to the next line of code,


Requirements:
1. The program should display data on the screen.
2. The screen output must match the task conditions.
3. The A class's initialize method must have the strictest access modifier.
4. The program must not read data from the keyboard.
*/

public class Solution {
    public static void main(String[] args) {
        new B(6);
    }

    public static class A {
        private int f1 = 7;

        public A(int f1) {
            this.f1 = f1;
            initialize();
        }

        private void initialize() {
            System.out.println(f1);
        }
    }

    public static class B extends A {
        protected int f1 = 3;

        public B(int f1) {
            super(f1);
            this.f1 += f1;
            initialize();
        }

        protected void initialize() {
            System.out.println(f1);
        }
    }
}

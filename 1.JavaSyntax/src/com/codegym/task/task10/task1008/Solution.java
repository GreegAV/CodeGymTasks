package com.codegym.task.task10.task1008;

/* 
Correct answer: d = 2.941
Add one type conversion to get the following answer: d = 2.941

Example output:
2.9411764705882355


Requirements:
1. The program should display text on the screen.
2. Don't change the screen output command.
3. The main() method must contain an int variable a.
4. The main() method must contain an int variable b.
5. The main() method must contain a double variable d.
6. Don't change the initial value of the variables during initialization. You can only add cast operators.
7. The program should display the number 2.9411764705882355.

*/

public class Solution {
    public static void main(String[] args) {
        int a = 50;
        int b = 17;
        double d = (double)a / b;
        System.out.println(d);
    }
}

package com.codegym.task.task04.task0415;

/* 
Rule of the triangle
Use the keyboard to enter three numbers a, b, and c (the lengths of the sides of the proposed triangle).
Determine whether a triangle with these sides can exist.
Display the result as follows:
"The triangle is possible." - if a triangle with these sides could exist.
"The triangle is not possible." - if a triangle with these sides cannot exist.

Hint:
A triangle can exist only if the sum of any two of its sides is greater than the third side.
You need to compare each side with the sum of the other two.
If even one side is larger than the sum of the other two sides, then no such triangle exists.


Requirements:
1. The program should read three numbers from the keyboard.
2. The program should display text on the screen according to the task conditions.
3. If a triangle with the specified sides could exist, you need to display: "The triangle is possible."
4. If a triangle with the specified sides cannot exist, you need to display: "The triangle is not possible."

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a + b > c ^ a + c > b ^ a < b + c)
            System.out.println("The triangle is possible.");
        else
            System.out.println("The triangle is not possible.");

    }
}
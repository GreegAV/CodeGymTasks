package com.codegym.task.task04.task0417;

/* 
Do we have a pair?
Use the keyboard to enter three integers.
Determine whether there is at least one pair of equal numbers among them.
If such a pair exists, display the numbers separated by a space.
If all three numbers are equal, then display all three.
Here are some examples:
a) if you enter the numbers
1
2
2
then we display
2 2

b) if you enter the numbers
2
2
2
then we display
2 2 2


Requirements:
1. The program should read the numbers from the keyboard.
2. The program should contain System.out.println() or System.out.print().
3. If two numbers are equal to each other, you must display them on the screen.
4. If all three numbers are equal, then display all three.
5. If there are no equal numbers, don't display anything.

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a == b & b == c) System.out.println(a + " " + a + " " + a);
        else {
            if (a == b)
                System.out.println(a + " " + b);
            if (a == c)
                System.out.println(a + " " + c);
            if (c == b)
                System.out.println(b + " " + c);
        }
    }
}
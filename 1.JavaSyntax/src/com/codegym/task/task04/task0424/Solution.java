package com.codegym.task.task04.task0424;

/* 
Three numbers
Use the keyboard to enter three integers.
One of the numbers is unique. The other two are identical. Display the index of the number that is different from the others.
Example for 4 6 6:
1

Example for 6 6 3:
3


Requirements:
1. The program should read the numbers from the keyboard.
2. The program should use System.out.println() or System.out.print().
3. The program should display the index of the number that is different from the others.
4. If all the numbers are different, don't display anything.

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a != b && a != c && c == b) {
            System.out.println(1);
        } else if (b != c && b != a && c == a) {

            System.out.println(2);
        } else if (c != a && c != b && a == b) {

            System.out.println(3);
        }
    }
}
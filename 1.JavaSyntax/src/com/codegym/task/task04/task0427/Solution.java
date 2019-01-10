package com.codegym.task.task04.task0427;

/* 
Describing numbers
Enter an integer from the keyboard in the range 1 - 999. Display a string description as follows:
"even single-digit number" - if the number is even and has one digit,
"odd single-digit number" - if the number is odd and has one digit,
"even two-digit number" - if the number is even and has two digits,
"odd two-digit number" - if the number is odd and has two digits,
"even three-digit number" - if the number is even and has three digits,
"odd three-digit number" - if the number is odd and has three digits.
If the entered number does not fall in the range 1 - 999, don't display anything.

Example for 100:
even three-digit number

Example for 51:
odd two-digit number


Requirements:
1. The program should read one number from the keyboard.
2. The program should use System.out.println() or System.out.print()..
3. The program should display a string description of the number and nothing else.
4. If the number is even and has one digit, display "even single-digit number".
5. If the number is odd and has one digit, display "odd single-digit number".
6. If the number is even and has two digits, display "even two-digit number".
7. If the number is odd and has two digits, display "odd two-digit number".
8. If the number is even and has three digits, display "even three-digit number".
9. If the number is odd and has three digits, display "odd three-digit number".
10. If the entered number doesn't fall in the range 1 - 999, don't display anything

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        if (a >= 1 && a <= 999) {
            if ((a >= 10 && a < 100)) {
                if (a % 2 != 0) System.out.println("odd two-digit number");
                else System.out.println("even two-digit number");
            }

            if ((a >= 1 && a < 10)) {
                if (a % 2 != 0) System.out.println("odd single-digit number");
                else System.out.println("even single-digit number");
            }

            if ((a >= 100 && a < 1000)) {
                if (a % 2 != 0) System.out.println("odd three-digit number");
                else System.out.println("even three-digit number");
            }
        }
    }
}

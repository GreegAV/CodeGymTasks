package com.codegym.task.task04.task0442;

/* 
Adding
Use the keyboard to enter numbers.
If the user enters -1, display the sum of all entered numbers and end the program.
-1 should be included in the sum.

Hint: one of the solutions to this problem uses the following construct:

while (true) {
    int number = read the number;
    if (check whether the number is -1)
        break;
}

Requirements:
1. The program should read the numbers from the keyboard.
2. If the user enters -1, the program should display the sum of all entered numbers and then end.
3. The program must calculate and display the sum of the entered numbers.
4. The program must use a for loop or a while loop.

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int sum = -1;
        while (true) {
            int number = scanner.nextInt();
            if (number == -1) {
                {
                    System.out.println(sum);
                    break;
                }
            } else sum += number;
        }
    }
}

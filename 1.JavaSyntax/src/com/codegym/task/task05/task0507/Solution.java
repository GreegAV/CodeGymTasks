package com.codegym.task.task05.task0507;

/* 
Arithmetic mean
Use the keyboard to enter numbers, and then calculate the arithmetic mean.
If the user enters -1, display the arithmetic mean of all entered numbers and end the program.
-1 should not be included in the calculation.

Here are some examples:
a) if you enter the numbers
1
2
2
4
5
-1
then we display
2.8

b) if you enter the numbers
4
3
2
1
-1
then we display
2.5

Hint: one of the solutions to this problem uses the following construct:

while (true) {
    int number = read the number;
    if (check whether the number is -1)
        break;
}

Requirements:
1. The program must read data from the keyboard.
2. The program should display data on the screen.
3. After entering -1, the program must correctly terminate.
4. If you sequentially enter the numbers 1, 2, 2, 4, 5 and -1, the program should display 2.8.
5. If you sequentially enter the numbers -100, 0, 100, and -1, the program should display 0.0.
6. If you sequentially enter the numbers 1 and -1, the program should display 1.0.
7. The displayed result should match the task conditions for any input data.

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        while (true) {
            int number = scanner.nextInt();
            if (number == -1 & count != 0) {
                {
                    System.out.println(sum / count);
                    break;
                }
            } else {
                sum += number;
                count += 1;
            }
        }
    }
}


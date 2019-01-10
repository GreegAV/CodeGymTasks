package com.codegym.task.task03.task0319;

/* 
Predictions
Use the keyboard to separately enter the name, number1, and number2.
Display the following phrase:
<name> will receive <number1> in <number2> years.

Here's an example:
Nick will receive 10000 in 5 years.


Requirements:
1. The program should output text.
2. The program must read data from the keyboard.
3. The displayed text must contain the entered name.
4. The displayed text must contain the entered number1.
5. The displayed text must contain the entered number2.
6. The displayed text must fully match the task conditions.

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println(name + " will receive " + number1 + " in " + number2 + " years.");
    }
}

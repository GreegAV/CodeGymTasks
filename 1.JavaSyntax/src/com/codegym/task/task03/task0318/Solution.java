package com.codegym.task.task03.task0318;

/* 
Plan to conquer the world
Enter the number and name from the keyboard. Display the following string:
<name> will take over the world in <number> years. Mwa-ha-ha!

Here's an example:
Kevin will take over the world in 8 years. Mwa-ha-ha!

The order in which the data is input matters a lot.


Requirements:
1. The program should output text.
2. The program must read data from the keyboard.
3. The displayed text must contain the entered name.
4. The displayed text must contain the entered number.
5. The displayed text must fully match the task conditions.

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String name = scanner.next();
        System.out.println(name + " will take over the world in " + number + " years. Mwa-ha-ha!");
    }
}

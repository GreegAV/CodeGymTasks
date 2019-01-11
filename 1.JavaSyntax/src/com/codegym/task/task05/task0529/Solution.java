package com.codegym.task.task05.task0529;

/*
Console-based piggy bank
Use the keyboard to enter numbers and calculate their sum until the user enters the word "sum".
Display the resulting sum on the screen.

Hint: to read from the keyboard until the string 'exit' is input, do this:

BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
while (true)
{
	String s = buffer.readLine();
	if (s.equals("exit"))
		break;
}

Requirements:
1. The program must read data from the keyboard.
2. The program should stop reading data from the keyboard after the user enters the word "sum" in lowercase letters and presses Enter.
3. The program should work correctly if the user enters one number and the word "sum".
4. The program should work correctly if the user enters two numbers and the word "sum".
5. The program should work correctly if the user enters more than two numbers and the word "sum".
6. The program should display text on the screen.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int s = 0;

        while (true) {
            String i1 = reader.readLine();
            if (i1.equals("sum")) {
                System.out.println(s);
                break;
            }
            else {
                s += Integer.parseInt(i1);
            }
        }
    }
}
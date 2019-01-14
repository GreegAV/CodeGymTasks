package com.codegym.task.task06.task0610;

import java.util.Scanner;

/* 
ConsoleReader class
Make the ConsoleReader class, which will have 4 static methods:
String readString() - reads a string from the keyboard
int readInt() - reads a number from the keyboard
double readDouble() - reads a fractional number from the keyboard
boolean readBoolean() - reads the string "true" or "false" from the keyboard
and returns the corresponding boolean value (true or false)

Please note: In each method, create a variable to read data from the console (BufferedReader or Scanner).


Requirements:
1. The readString method must read and return a String.
2. The readInt method must read and return an int.
3. The readDouble method must read and return a double.
4. The readBoolean method must read and return a boolean value.

*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //write your code here
        return new Scanner(System.in).nextLine();

    }

    public static int readInt() throws Exception {
        //write your code here
        return new Scanner(System.in).nextInt();

    }

    public static double readDouble() throws Exception {
        //write your code here
        return new Scanner(System.in).nextDouble();

    }

    public static boolean readBoolean() throws Exception {
        //write your code here
        return new Scanner(System.in).nextBoolean();

    }

    public static void main(String[] args) {

    }
}

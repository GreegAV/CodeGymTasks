package com.codegym.task.task06.task0611;

/* 
StringHelper class
Make the StringHelper class, which will have 2 static methods:
String multiply(String s, int count) - returns a string that has been repeated count times.
String multiply(String s) - returns a string that has been repeated 5 times.

For example:
Amigo -> AmigoAmigoAmigoAmigoAmigo


Requirements:
1. The program must not read data from the keyboard.
2. The StringHelper class's methods must return a string.
3. The StringHelper class's methods must be static.
4. The StringHelper class's methods must be public.
5. The multiply(String s, int count) method must return a string that has been repeated count times.
6. The multiply(String s) method must return a string that has been repeated 5 times.

*/

public class StringHelper {
    public static String multiply(String s) {
        String result = "";
        //write your code here
        for (int i = 0; i < 5; i++) {
            result += s;
        }
        return result;
    }

    public static String multiply(String s, int count) {
        String result = "";
        //write your code here
        for (int i = 0; i < count; i++) {
            result += s;
        }
        return result;
    }

    public static void main(String[] args) {

    }
}

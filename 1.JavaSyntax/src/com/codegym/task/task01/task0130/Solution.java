package com.codegym.task.task01.task0130;

/* 
Our first converter!
The convertCelsiusToFahrenheit(int celsius) method accepts a value in degrees Celsius.
The method should convert the temperature and return the value in degrees Fahrenheit.
The Celsius temperature (TC) and the Fahrenheit temperature (TF) are related by the following relationship:
TC = (TF - 32) * 5/9.

Consider this example:
A value of 41 is passed to the convertCelsiusToFahrenheit method.

Example output:
105.8


Requirements:
1. The convertCelsiusToFahrenheit(int) method must be public and static.
2. The convertCelsiusToFahrenheit method must return a double.
3. The convertCelsiusToFahrenheit method should not display anything.
4. The convertCelsiusToFahrenheit method must correctly convert degrees Celsius to degrees Fahrenheit and return the result.

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertCelsiusToFahrenheit(41));
    }

    public static double convertCelsiusToFahrenheit(int celsius) {
        //write your code here

        return 9.0 / 5.0 * celsius + 32.0;
    }
}
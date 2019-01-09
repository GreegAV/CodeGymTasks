package com.codegym.task.task03.task0303;

/* 
Currency exchange
Write code for the convertEurToUsd method, which converts euros to dollars at a given exchange rate.
Use a return statement to return the result from the convertEurToUsd method. Example: return 123*435;
Call the convertEurToUsd method twice in the main method with any arguments.
Display the results, each time on a new line.

Hint:
The result is calculated using the following formula: US dollars = euros * exchange rate


Requirements:
1. The convertEurToUsd method must multiply the euro amount by the exchange rate and return the result.
2. The main method must call the convertEurToUsd method twice with any arguments.
3. The main method should display the result of the calls, each time on a new line.
4. The convertEurToUsd method should not display anything.

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        System.out.println(convertEurToUsd(5, 2.0));
        System.out.println(convertEurToUsd(7, 2.5));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        //write your code here
        return eur * exchangeRate;
    }
}

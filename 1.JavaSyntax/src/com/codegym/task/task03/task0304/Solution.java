package com.codegym.task.task03.task0304;

/* 
Task with percentages
Write the code for the addTenPercent method, which increases the passed integer by 10%.
Use the return statement to return the result from the addTenPercent method.

Consider this example:
return 123 * 435;


Requirements:
1. The addTenPercent method should increase the passed number by 10% percent.
2. The main method should call the addTenPercent method.
3. The main method should display the results of the call.
4. The addTenPercent method should not display anything.

*/

public class Solution {
    public static double addTenPercent(int i) {
        //write your code here
        return i * 1.1;
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}

package com.codegym.task.task04.task0411;

/* 
Seasons on Terra
Write the checkSeason method.
Based on a number representing a month, the method should determine and display the season (winter, spring, summer, autumn).

Example for number 2:
winter

Example for number 5:
spring

Hint: the numbers 12, 1, and 2 are winter months; 3, 4, and 5 are spring, etc.


Requirements:
1. The program should display text on the screen.
2. The main method should not call System.out.println or System.out.print.
3. The main method must call the checkSeason method.
4. The checkSeason method must be static void, and have only one int parameter.
5. The checkSeason method should display text on the screen in accordance with the task conditions.

*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        //write your code here
        switch (month) {
            case 1: {

            }
            case 2: {
                System.out.println("winter");
                break;
            }
            case 3: {

            }
            case 4: {

            }
            case 5: {
                System.out.println("spring");
                break;
            }
            case 6: {

            }
            case 7: {

            }
            case 8: {
                System.out.println("summer");
                break;
            }
            case 9: {

            }
            case 10: {

            }
            case 11: {
                System.out.println("autumn");
                break;
            }
            case 12: {
                System.out.println("winter");
                break;
            }

        }
    }
}
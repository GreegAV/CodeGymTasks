package com.codegym.task.task04.task0402;

/* 
Price of apples
Calculate the total cost of apples.
The total cost of apples corresponds to public static int applePrice.


Requirements:
1. The program should display text on the screen.
2. The Apple class's addPrice method should not display text on the screen.
3. The Apple class's applePrice variable must be a static int initialized to zero.
4. The main method should call the addPrice method only twice.
5. The Apple class's addPrice method should increase the cost of apples by the passed-in value.

*/
public class Solution {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.addPrice(50);
        Apple apple2 = new Apple();
        apple2.addPrice(100);
        System.out.println("The cost of apples is " + Apple.applePrice);
    }

    public static class Apple {
        public static int applePrice = 0;

        public static void addPrice(int applePrice) {
            //write your code here
            Apple.applePrice+=applePrice;
        }
    }
}

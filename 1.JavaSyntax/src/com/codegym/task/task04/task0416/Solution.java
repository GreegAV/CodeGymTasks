package com.codegym.task.task04.task0416;

/* 
Crossing the road blindly
The pedestrian traffic light is programmed as follows:
at the beginning of each hour, the green signal is on for three minutes,
then the signal is yellow for one minute,
and then it is red for one minute.
Then the light is green again for three minutes, etc.
Use the keyboard to enter a real number t that represents the number of minutes
that have elapsed since the beginning of the hour.
Determine what color the traffic light is at the specified time.
Display the result as follows:
"green" if the light is green,
"yellow" if the light is yellow, and
"red" if the light is red.

Example for 2.5:
green
Example for 3:
yellow
Example for 4:
red
Example for 5:
green


Requirements:
1. The program should read a real number from the keyboard.
2. The program should display text on the screen.
3. If the light is green, display: "green"
4. If the light is yellow, display: "yellow"
5. If the light is red, display: "red"

*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        double t = scanner.nextDouble();
        t%=5;
//        System.out.println(t);
//        int n = (int) (t / 5);
//        t = t - 5 * n;
        String s = "green";
        if (t >= 3)
            s = "yellow";
        if (t >= 4)
            s = "red";
        System.out.println(s);
    }
}
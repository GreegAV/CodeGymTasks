package com.codegym.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Different methods for different types
1. Read data from the console until the word "exit" is entered.
2. For each value (except "exit"), call the print method. If the value:
2.1. contains a period ("."), then call the print method for Double;
2.2. is greater than zero, but less than 128, then call the print method for short;
2.3. less than or equal to zero or greater than or equal to 128, then call the print method for Integer;
2.4. otherwise, call the print method for String.


Requirements:
1. The program must read data from the keyboard.
2. The program should stop reading data from the keyboard after "exit" is entered.
3. If the entered string contains a period (".") and can be correctly converted to a Double,
the print(Double value) method should be called.
4. If the entered string can be correctly converted to a short and the resulting number is greater than 0,
but less than 128, the print(short value) method should be called.
5. If the entered string can be correctly converted to an Integer and the resulting number is less than or equal to 0
or greater than or equal to 128, the print(Integer value) method should be called.
6. In all other cases, the print(String value) method should be called.

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s;
        while (true) {
            s = reader.readLine();
            if ("exit".equals(s))
                break;

            try {
                if (s.indexOf(".") > 0) {
                    Double value = Double.parseDouble(s);
                    print(value);
                    continue;
                }

                int value = Integer.parseInt(s);
                if (value > 0 && value < 128) {
                    print((short) value);
                    continue;
                }

                if (value >= 128 || value <= 0) {
                    print(value);
                    continue;
                }
            } catch (NumberFormatException e) {
            }

            print(s);
        }
    }

    public static void print(Double value) {
        System.out.println("This is a Double. Value: " + value);
    }

    public static void print(String value) {
        System.out.println("This is a String. Value: " + value);
    }

    public static void print(short value) {
        System.out.println("This is a short. Value: " + value);
    }

    public static void print(Integer value) {
        System.out.println("This is an Integer. Value: " + value);
    }
}

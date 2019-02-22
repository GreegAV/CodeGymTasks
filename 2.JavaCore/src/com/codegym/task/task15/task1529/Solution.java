package com.codegym.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Mastering the static block
1. In separate files, create Plane and Helicopter classes that implement the CanFly interface.
2. The Plane class must have a constructor with an int parameter (the number of passengers on board).
3. In the Solution class's static reset method:
3.1. Read a String from the console.
3.2. If the value is "helicopter", then assign a Helicopter object to the static CanFly field result.
3.3. If the value is "plane", then read a second value (an int, the number of passengers),
and assign a Plane object to the static CanFly field result.
4. In the static block, initialize the CanFly field result by calling the reset method.
5. Close the input stream with the close() method.


Requirements:
1. The Plane class must be in a separate file and implement the CanFly interface.
2. The Helicopter class must be in a separate file and implement the CanFly interface.
3. The Plane class must have a constructor with an int parameter.
4. The Solution class must implement the public static void reset() method.
5. The reset method should read lines from the keyboard.
6. If the input string is "helicopter", a Helicopter object should be stored in the variable result.
7. If the input string is "plane", a Plane object should be stored in the variable result.
8. The Solution class's field result must be initialized in the static block by calling the reset method.

*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //write your code here
        Solution.reset();
    }

    public static CanFly result;

    public static void reset() {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String s = reader.readLine();
            if (s.equals("helicopter"))
                result = new Helicopter();
            if (s.equals("plane")) {
                int n = Integer.parseInt(reader.readLine());
                result = new Plane(n);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
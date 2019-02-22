package com.codegym.task.task15.task1527;

import java.util.LinkedHashMap;
import java.util.Scanner;

/* 
Request parser
Read a URL from the console.
Display a space-delimited list of all the parameters (The parameters follow the "?" and are separated by "&", e.g. "lvl=15").
The URL contains at least 1 parameter.
The parameters must be displayed in the same order in which they are present in the URL.
If the obj parameter is present, pass its value to the relevant alert method.
alert(double value) - for numbers (fractional numbers have a decimal point)
alert(String value) - for strings
Note that the alert method must be called AFTER the list of all parameters is displayed.

Example 1

Input:
http://codegym.cc/alpha/index.html?lvl=15&view&name=Amigo

Output:
lvl view name

Example 2

Input:
http://codegym.cc/alpha/index.html?obj=3.14&name=Amigo

Output:
obj name
double: 3.14


Requirements:
1. The program should read only one line from the keyboard.
2. The Solution class must not have static fields.
3. The program must display data on the screen in accordance with the task conditions.
4. The program should call the alert method with the double parameter if the obj parameter can be correctly converted to a double.
5. The program should call the alert method with the String parameter if the obj parameter CANNOT be correctly converted to a double.

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String params = s.substring(s.indexOf("?") + 1);
        String[] splitParts = params.split("&");

        //Split every item in splitParts array by "=" and put to Map as key and value
        LinkedHashMap<String, String> paramters = new LinkedHashMap<String, String>();
        for (int i = 0; i < splitParts.length; i++) {
            int posEqualChar = splitParts[i].indexOf("=");
            if (posEqualChar < 0) { //no param, only key exist
                paramters.put(splitParts[i], null);
                continue;
            }
            String key = splitParts[i].substring(0, posEqualChar);
            String value = splitParts[i].substring(posEqualChar + 1);
            paramters.put(key, value);
        }

        //key printing
        for (String key : paramters.keySet()) {
            System.out.print(key + " ");
        }

        //print alert
        System.out.println();
        String objParameter = paramters.get("obj");
        if (objParameter == null) {
            return;
        }

        try {
            alert(Double.parseDouble(objParameter));
        } catch (NumberFormatException e) {
            alert(objParameter);
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}

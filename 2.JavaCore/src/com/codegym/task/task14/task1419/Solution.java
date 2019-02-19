package com.codegym.task.task14.task1419;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/* 
Exception invasion
Populate the list exceptions with ten (10) different exceptions.
The first exception is already implemented in the initExceptions method.


Requirements:
1. The list exceptions must contain 10 elements.
2. All items in the list exceptions must be exceptions (descendants of the Throwable class).
3. All items in the list exceptions must be unique.
4. The initExceptions method must be static.

*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();
        System.out.println(exceptions.size());
        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   // The first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //write your code here


        try {
            String s = null;
            s.trim();
        } catch (NullPointerException e) {
            exceptions.add(e);
        }

        try {
            String s = "";
            s.charAt(10);
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            int[] v = new int[5];
            v[5] = 10;
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            Object x = new Integer(0);
            System.out.println((String) x);
        } catch (ClassCastException e) {
            exceptions.add(e);
        }

        try {
            String s = "digital value";
            int a = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        try {
            FileInputStream f = new FileInputStream("very_bad_file.txt");
        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }

        try {
            Object o[] = new String[5];
            o[2] = new Integer(200);
        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }

        try {
            int[] v = new int[-10];
        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }

        try {
            throw new Exception();
        } catch (Exception e) {
            exceptions.add(e);
        }
    }
}

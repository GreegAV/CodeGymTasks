package com.codegym.task.task08.task0810;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/* 
Time for 10,000 get calls
Measure how long it takes to perform 10,000 get and set calls on each list.
The getGetTimeInMs method must return its execution time in milliseconds.


Requirements:
1. The program should display numbers on the screen.
2. The main method should call the getGetTimeInMs method only twice.
3. The main method should call the fill method only twice.
4. The fill(List list) method must insert 10,000 items into the list.
5. The get10000(List list) method should call get 10,000 times on the list.
6. The getGetTimeInMs method must call the get10000(List list) method only once.
7. The getGetTimeInMs method should return the time (in milliseconds) that it takes to make 10,000 get calls on the list.

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getGetTimeInMs(fill(new ArrayList())));
        System.out.println(getGetTimeInMs(fill(new LinkedList())));
    }

    public static List fill(List list) {
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }
        return list;
    }

    public static long getGetTimeInMs(List list) {
        // write your code here
        Date start = new Date();
        get10000(list);

        // write your code here
        Date finish = new Date();
        return finish.getTime() - start.getTime();
    }

    public static void get10000(List list) {
        if (list.isEmpty()) return;
        int x = list.size() / 2;

        for (int i = 0; i < 10000; i++) {
            list.get(x);
        }
    }
}

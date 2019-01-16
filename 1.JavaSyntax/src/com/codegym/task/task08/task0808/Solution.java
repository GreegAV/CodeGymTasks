package com.codegym.task.task08.task0808;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
10 thousand deletions and insertions
Using an ArrayList and LinkedList, perform 10,000 insertions, deletions, and get and set calls.


Requirements:
1. The program should not display text on the screen.
2. The program should not read values from the keyboard.
3. The Solution class must contain only 5 methods.
4. The insert10000(List list) method must insert 10,000 items into the list.
5. The get10000(List list) method should call get 10,000 times on the list.
6. The set10000(List list) method should call set 10,000 times on the list.
7. The remove10000(List list) method must remove 10,000 items from the list.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        // ArrayList
        ArrayList arrayList = new ArrayList();
        insert10000(arrayList);
        get10000(arrayList);
        set10000(arrayList);
        remove10000(arrayList);

        // LinkedList
        LinkedList linkedList = new LinkedList();
        insert10000(linkedList);
        get10000(linkedList);
        set10000(linkedList);
        remove10000(linkedList);
    }

    public static void insert10000(List list) {
        //write your code here
        for (int i = 0; i < 10000; i++) {
            list.add(new Object());
        }

    }

    public static void get10000(List list) {
        //write your code here
        for (int i = 0; i < 10000; i++) {
            list.get(i);
        }
    }

    public static void set10000(List list) {
        //write your code here
        for (int i = 0; i < 10000; i++) {
            list.set(i, i);
        }

    }

    public static void remove10000(List list) {
        //write your code here
        for (int i = 0; i < 10000; i++) {
            list.remove(list.get(0));
        }

    }
}

package com.codegym.task.task07.task0707;

import java.util.ArrayList;

/* 
What sort of list is that?
1. Create a list of strings.
2. Add 5 different strings to it.
3. Display its size on the screen.
4. Use a loop to display its contents, each value on a new line.

Note:
Add strings to the list only after the list is initialized.


Requirements:
1. The program should not read anything from the keyboard.
2. Declare a ArrayList<String> variable and immediately initialize it.
3. The program should add any 5 strings to the list.
4. The program should display the size of the list on the screen.
5. The program should display the contents of the list, each value on a new line.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("1");
        arrayList.add("22");
        arrayList.add("333");
        arrayList.add("4444");
        arrayList.add("55555");
        System.out.println(arrayList.size());
        for (String str : arrayList) {
            System.out.println(str);
        }
    }
}

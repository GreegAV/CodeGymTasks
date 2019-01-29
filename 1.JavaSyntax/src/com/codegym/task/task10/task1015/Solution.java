package com.codegym.task.task10.task1015;

import java.util.ArrayList;

/* 
Array of string lists
Create an array whose elements are lists of strings.
Fill the array with any data and display it on the screen.


Requirements:
1. The createList method must declare and initialize an array with ArrayList<String> elements.
2. The createList method must return the created array.
3. The createList method must add elements (string lists) to the array. The lists must not be empty.
4. The program should display data on the screen.
5. The main method must call the createList method.
6. The main method must call the printList method.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //write your code here
        ArrayList<String>[] list = new ArrayList[2];
        ArrayList<String> podList = new ArrayList<>();
        podList.add("asdasd");
        podList.add("DDDDDDD");
        podList.add("WSGKJMSLGK");
        list[0] = podList;
        podList.clear();
        podList.add("LLFLLDF:GDFL:");
        podList.add("LLFLLDsfdsdfFL:");
        podList.add("sdfsdfsdfGDFL:");
        list[1] = podList;
        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}
package com.codegym.task.task07.task0713;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Playing Javarella
1. Enter 20 numbers from the keyboard, save them in a list, and then sort them to three other lists:
Numbers divisible by 3 (x%3==0), numbers divisible by 2 (x%2==0), and all other numbers.
Numbers simultaneously divisible by 3 and 2 (for example 6) go into both lists.
The order in which the lists are declared is very important.
2. The printList method should display each list item on a new line.
3. Using the printList method, display these three lists.
First, the list for x%3, then the list for x%2, and then the last list.


Requirements:
1. Declare and immediately initialize 4 ArrayList<Integer> variables. The first list will be the main one.
The other lists will be supplementary.
2. Read 20 numbers from the keyboard and add them to the main list.
3. Add to the first supplementary list all numbers in the main list that are divisible by 3.
4. Add to the second supplementary list all numbers in the main list that are divisible by 2.
5. Add to the third supplementary list all the remaining numbers from the main list.
6. The printList method should display each element of the passed list on a new line.
7. The program should display the three supplementary lists using the printList method.

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<Integer> mainList = new ArrayList<>();
        ArrayList<Integer> main3 = new ArrayList<>();
        ArrayList<Integer> main2 = new ArrayList<>();
        ArrayList<Integer> mainRest = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num = new Scanner(System.in).nextInt();
            mainList.add(num);
            if (num % 3 == 0)
                main3.add(num);
            if (num % 2 == 0)
                main2.add(num);
            if (num % 3 != 0 & num % 2 != 0)
                mainRest.add(num);
        }
        printList(main2);
        printList(main3);
        printList(mainRest);
    }

    public static void printList(List<Integer> list) {
        //write your code here
        for (int num : list) {
            System.out.println(num);
        }
    }
}

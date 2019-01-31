package com.codegym.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Task about algorithms
Task: The user enters a list of words (and numbers) from the keyboard.
The words are displayed in ascending order, the numbers in descending order.

Example input:
Cherry
1
Bob
3
Apple
22
0
Watermelon

Example output:
Apple
22
Bob
3
Cherry
1
0
Watermelon


Requirements:
1. The program must read data from the keyboard.
2. The program should display data on the screen.
3. The displayed words should be sorted in ascending order (using the provided isGreaterThan method).
4. The displayed numbers must be sorted in descending order.
5. The main method should use the sort method.
6. The sort() method should call the isGreaterThan() method.
7. The sort() method should call the isNumber() method.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        //Делаем 3 массива: 1 - массив слов, 2 - массив чисел, 3 - массив с порядком
        // (слово или число, что бы после сортировок правильно расставить)
        ArrayList<String> words = new ArrayList<>(); //слова
        ArrayList<Integer> numbers = new ArrayList<>(); //числа
        ArrayList<String> por = new ArrayList<>(); //порядок и тип
        for (int i = 0; i < array.length; i++) { //раскидываем слова и числа по разным массивам, у каждого свой
            if (isNumber(array[i])) {
                numbers.add(Integer.parseInt(array[i]));
                por.add("n");
            } else {
                words.add(array[i]);
                por.add("w");
            }
        }

        for (int i = 0; i < numbers.size() - 1; i++) { //сортируем числа по убыванию
            for (int j = 0; j < numbers.size() - 1; j++) {
                if (numbers.get(j) < numbers.get(j + 1)) {
                    int tmp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, tmp);
                }
            }
        }

        for (int i = 0; i < words.size() - 1; i++) { //сортируем слова по возрастанию
            for (int j = 0; j < words.size() - 1; j++) {
                if (isGreaterThan(words.get(j), words.get(j + 1))) {
                    String tmp = words.get(j);
                    words.set(j, words.get(j + 1));
                    words.set(j + 1, tmp);
                }
            }
        }
        //Итераторы для массива array, для массива со словами и для массива с числами
        int arIt = 0;
        int worIt = 0;
        int numIt = 0;
        //после всех сортировок закидываем массивы со словами и числами в массив array, созраняя при этом порядок введения
        for (int i = 0; i < por.size(); i++) {
            if (por.get(i).equals("n")) {
                array[arIt] = Integer.toString(numbers.get(numIt));
                arIt++;
                numIt++;
            } else {
                array[arIt] = words.get(worIt);
                arIt++;
                worIt++;
            }
        }
    }

    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }

    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-')
                    || (!Character.isDigit(c) && c != '-')) {
                return false;
            }
        }
        return true;
    }
}
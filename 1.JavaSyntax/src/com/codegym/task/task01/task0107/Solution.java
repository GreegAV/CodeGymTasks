package com.codegym.task.task01.task0107;
/*
Комментарии излишни
Раскомментируй некоторые строчки, чтобы программа вывела на экран числа 12 и 2 (сначала 12, а затем 2).


Требования:
1. Программа должна выводить на экран числа 12 и 2.
2. Нельзя изменять строки с объявлением переменных.
3. Нельзя изменять строки отвечающие за вывод в консоль.
4. Нужно раскомментировать необходимые строки и не менять остальные.
*/
public class Solution {
    public static void main(String[] args) {
        int x = 2;
        int y = 12;

        // y = x * y;
        y = x + y;

        x = y - x;
        y = y - x;

        System.out.println(x);
        System.out.println(y);
    }
}

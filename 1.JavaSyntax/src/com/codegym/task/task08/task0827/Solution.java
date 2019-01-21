package com.codegym.task.task08.task0827;

import java.util.Date;

/* 
Working with dates
1. Implement the isDateOdd(String date) method so that it returns true if the number of days since the beginning of the year is odd, and otherwise returns false
2. String date is passed in the form: FEBRUARY 1 2013
Don't forget to account for the first day of the year.

Example:
JANUARY 1 2000 = true
JANUARY 2 2020 = false


Requirements:
1. The program should display text on the screen.
2. The Solution class must have two methods.
3. The isDateOdd() method must return true if the number of days since the beginning of the year is odd,
and must otherwise return false.
4. The main() method should call the isDateOdd() method.

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {

        Date yearStartDate = new Date();
        Date testDate = new Date(date);

        yearStartDate.setYear(testDate.getYear());
        yearStartDate.setDate(1);      // первое число
        yearStartDate.setMonth(0);     // месяц январь, нумерация для месяцев 0-11
        yearStartDate.setHours(0);      // 0 часов
        yearStartDate.setMinutes(0);    // 0 минут
        yearStartDate.setSeconds(0);    // 0 секунд

        long msTimeDistance = testDate.getTime() - yearStartDate.getTime();
        long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках

        int dayCount = (int) (msTimeDistance / msDay); //количество целых дней
        return !(dayCount % 2 == 0);
    }
}

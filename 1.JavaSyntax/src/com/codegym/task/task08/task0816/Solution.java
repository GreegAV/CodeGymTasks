package com.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Kind Emma and the summer holidays
Create a Map<String, Date> and add ten entries that represent (last name, birth date) pairs.
Remove from the map all people born in the summer.
Hint: At CodeGym, summer lasts from June 1 to August 31.


Requirements:
1. The program should not display text on the screen.
2. The program should not read values from the keyboard.
3. The createMap() method must create and return a HashMap that has (String, Date) elements and contains 10 entries.
4. The removeAllSummerPeople() method should remove from the map all people born in the summer.

*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        //write your code here
        String months[] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (int i = 0; i < 9; i++) {
            map.put("Stallone" + i, df.parse("" + months[i] + " " + (i * i + 1) % 28 + " " + (1980 + i)));
        }
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //write your code here
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Date date = iterator.next().getValue();
            if (date.getMonth() > 4 & date.getMonth() < 8)
                iterator.remove();
        }
    }

    public static void main(String[] args) {

    }
}

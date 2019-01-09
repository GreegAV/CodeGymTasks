package com.codegym.task.task01.task0123;

/* 
We don't need any extra lines
Comment out variables that are not used anywhere. The program must compile.


Requirements:
1. Don't change the variable types.
2. Don't change the variable values.
3. Don't add new lines to the program, and don't delete existing lines.
4. You need to comment out the unused variables.
5. The program's output should not change.

*/

public class Solution {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        double c = b + 38;
     //   int d = a + 12;
     //   double e = 12.3;
        String s = "s" + a;
        String s1 = a + "b";
    //    String s2 = "a";
        String s3 = s1 + "a";
        String s4 = s3 + "b";
        System.out.println(c + s4 + s);
    }
}

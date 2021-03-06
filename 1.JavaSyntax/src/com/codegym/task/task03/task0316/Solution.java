package com.codegym.task.task03.task0316;

/* 
Escaping characters
Display the following text (two lines):
This is a Windows path: "C:\Program Files\Java\jdk1.8.0_172\bin"
This is a Java string: \"C:\\Program Files\\Java\\jdk1.8.0_172\\bin\"

Hint:
\” – Insert a double quote character in the text at this point.
\\ – Insert a backslash character in the text at this point.


Requirements:
1. The program should output text.
2. Two lines must be displayed.
3. The first line of text should be: This is a Windows path: "C:\Program Files\Java\jdk1.8.0_172\bin"
4. The second line of text should be: This is a Java string: \"C:\\Program Files\\Java\\jdk1.8.0_172\\bin\"

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        System.out.println("This is a Windows path: \"C:\\Program Files\\Java\\jdk1.8.0_172\\bin\"");
        System.out.println("This is a Java string: \\\"C:\\\\Program Files\\\\Java\\\\jdk1.8.0_172\\\\bin\\\"");
    }
}

package com.codegym.task.task13.task1307;

/* 
Parameterized interface
Make the StringObject class implement the SimpleObject interface using a String parameter.


Requirements:
1. The StringObject class must implement the SimpleObject interface.
2. The SimpleObject interface in the StringObject class must be implemented using a String parameter.
3.  The StringObject class must implement the SimpleObject interface's getInstance method.
4. Don't create additional classes or interfaces.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String> {
        //write your code here
        @Override
        public SimpleObject getInstance() {
            return null;
        }
    }
}
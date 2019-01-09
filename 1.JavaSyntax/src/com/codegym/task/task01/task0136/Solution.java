package com.codegym.task.task01.task0136;

/* 
Even to the moon!
"Amigo, did you know that lunar gravity is about 17% of gravity on Earth?"
"Nope."
"Neither did I. Now this information will be used a lot.
To avoid having to manually calculate it each time, implement a getWeight(int) method that
takes a person's body weight on Earth (in newtons), and returns the weight of that person on the moon (in newtons).
The method should return a double."

Consider this example:
The getWeight method is called with the argument 888.

Example output:
150.96


Requirements:
1. The getWeight(int) method must be public and static.
2. The getWeight method must return a double.
3. The getWeight method should not display anything.
4. The getWeight method should correctly convert the Earth weight in newtons to the lunar weight, and then return this value.

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        // write your code here
        return earthWeight * 0.17;
    }
}
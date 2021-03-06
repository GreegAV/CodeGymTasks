package com.codegym.task.task14.task1417;

import java.util.ArrayList;
import java.util.List;

/* 
Currencies
Expand the program's ability to manipulate currencies.

1. Create a private double field amount in the abstract Money class.
2. Create a public getter for the field amount (public double getAmount()) so you can access it outside the Money class.
3. In the separate files, create Euro, Ruble, and USD classes, which will be descendants of the Money class.
4. In the Euro, Ruble, and USD classes, implement the getCurrencyName method, which will
return the abbreviated nameof the currency (String) (EUR, RUB, USD).
5. In the Euro, Ruble, and USD classes, implement a public constructor that takes one argument
and calls the constructor of the base class (super class) with this argument.
6. Populate the allMoney list with all possible currency objects in accordance with the task
conditions and the functionality of the program.


Requirements:
1. The Money class must have a private double field amount.
2. The Money class must implement a public constructor with one double parameter, which sets the variable
amount to the passed parameter.
3. The Money class must implement a public getAmount method that returns the value of the field amount.
4. The Euro, Ruble, and USD classes must be descendants of the Money class and be located in separate files.
5. The Euro, Ruble and USD classes must implement the getCurrencyName method.
6. The getCurrencyName method must return the abbreviated name of the corresponding currency (String).
7. The Euro, Ruble, and USD classes must implement a public constructor with one double parameter.
This constructor must set the value of the Money class's field amount by calling the parent class's
constructor with the same argument.

*/

public class Solution {
    public static void main(String[] args) {
        Person paul = new Person("Paul");
        for (Money money : paul.getAllMoney()) {
            System.out.println(paul.name + " has a stash of " + money.getAmount() + " " + money.getCurrencyName());
        }
    }

    static class Person {
        public String name;

        Person(String name) {
            this.name = name;
            this.allMoney = new ArrayList<Money>();
            //write your code here
            this.allMoney.add(new USD(10));
            this.allMoney.add(new Ruble(100));
            this.allMoney.add(new Euro(1000));
        }

        private List<Money> allMoney;

        public List<Money> getAllMoney() {
            return allMoney;
        }
    }
}

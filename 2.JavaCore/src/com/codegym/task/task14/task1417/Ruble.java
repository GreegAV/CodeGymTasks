package com.codegym.task.task14.task1417;


public class Ruble extends Money {
    private double amount;

    @Override
    public double getAmount() {
        return this.amount;
    }

    public Ruble(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}

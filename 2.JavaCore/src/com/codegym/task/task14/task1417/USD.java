package com.codegym.task.task14.task1417;


public class USD extends Money {
    private double amount;

    @Override
    public double getAmount() {
        return this.amount;
    }

    public USD(double amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}

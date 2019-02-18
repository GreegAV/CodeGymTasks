package com.codegym.task.task14.task1408;

public class NorthAmericanHen extends Hen {
    @Override
    String getDescription() {
        return super.getDescription() + " I come from NorthAmerica. I lay " + getMonthlyEggCount() + " eggs a month.";
    }

    @Override
    int getMonthlyEggCount() {
        return 2;
    }
}
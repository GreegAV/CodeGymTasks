package com.codegym.task.task14.task1408;

public class EuropeanHen extends Hen {
    @Override
    String getDescription() {
        return super.getDescription() + " I come from Europe. I lay " + getMonthlyEggCount() + " eggs a month.";
    }

    @Override
    int getMonthlyEggCount() {
        return 3;
    }
}
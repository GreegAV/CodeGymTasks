package com.codegym.task.task14.task1408;

public class AfricanHen extends Hen {
    @Override
    String getDescription() {
        return super.getDescription() + " I come from Africa. I lay " + this.getMonthlyEggCount() + " eggs a month.";
    }

    @Override
    int getMonthlyEggCount() {
        return 5;
    }
}
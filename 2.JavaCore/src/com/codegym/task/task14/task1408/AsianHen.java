package com.codegym.task.task14.task1408;

public class AsianHen extends Hen {
    @Override
    String getDescription() {
        return super.getDescription() + " I come from Asia. I lay " + getMonthlyEggCount() + " eggs a month.";
    }

    @Override
    int getMonthlyEggCount() {
        return 4;
    }
}
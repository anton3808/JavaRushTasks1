package com.javarush.task.task14.task1417;

/**
 * Created by Anton on 22.07.2017.
 */
public class Hrivna extends Money{

    public Hrivna(double amount) {
        super(amount);
    }

    @Override
    public double getAmount() {
        return 0;
    }

    @Override
    public String getCurrencyName() {
        return "HRN";
    }
}

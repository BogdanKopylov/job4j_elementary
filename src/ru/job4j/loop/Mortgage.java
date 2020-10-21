package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        double amount1 = amount;
        while (amount1 > 0) {
            amount1 = (amount1 * percent) + amount1 - salary;
            year++;
        }

        return year;
    }
}

package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] cOINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int turnMoney = money - price;
        for (int coin : cOINS) {
            while (turnMoney >= coin) {
                turnMoney -= coin;
                rsl[size] = coin;
                size++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
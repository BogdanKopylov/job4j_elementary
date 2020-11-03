package ru.job4j.array;

public class AlgoArray {
    public static void main(String[] args) {
        int[] array = new int[] {5, 3, 2, 1, 4};
        int cell = array[0];
        array[0] = array[3];
        array[3] = cell;
        cell = array[1];
        array[1] = array[2];
        array[2] = cell;
        cell = array[3];
        array[3] = array[4];
        array[4] = cell;
        for (int i : array) {
            System.out.println(i);
        }
    }
}

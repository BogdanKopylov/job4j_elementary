package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] nums = {{6}, {4, 43}, {5, 33, 1}, {6, 5, 4, 3}};
        for (int[] num : nums) {
            System.out.println(num.length);
        }
    }
}

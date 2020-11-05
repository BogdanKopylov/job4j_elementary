package ru.job4j.condition;

public class Max {
    public static int max(int one, int two) {
        return Math.max(one, two);
    }

    public static int max(int one, int two, int three) {
        return max(one, max(two, three));
    }

    public static int max(int one, int two, int three, int four) {
        return max(one, max(two, three, four));
    }

    public static void main(String[] args) {
        int result = Max.max(6, 55);
        System.out.println(result);
    }
}

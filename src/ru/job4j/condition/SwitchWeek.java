package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        String name = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Ошибка";
        };
        return name;
    }

    public static void main(String[] args) {
        System.out.println(nameOfDay(-9));
        System.out.println(nameOfDay(6));
        System.out.println(nameOfDay(0));
    }
}

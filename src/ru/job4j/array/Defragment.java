package ru.job4j.array;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int nullIndex = index;
                for (int i = nullIndex; i < array.length; i++) {
                    if (array[i] != null) {
                        int notNullIndex = i;
                        swap(array, nullIndex, notNullIndex);
                        break;
                    }

                }
            }
            System.out.print(array[index] + " ");
        }
        return array;
    }

    public static void swap(String[] array, int indexNull, int indexNotNull) {
        array[indexNull] = array[indexNotNull];
        array[indexNotNull] = null;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (String index : compressed) {
            System.out.print(index + " ");
        }
    }
}

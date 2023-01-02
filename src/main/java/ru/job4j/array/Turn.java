package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int index = 0; index <= (array.length / 2 - 1); index++) {
            int len = array.length;
            int temp = array[index];
            array[index] = array[len - 1 - index];
            array[len - 1 - index] = temp;
        }
        return array;
    }
}

package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {

    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort690Then069() {
        int[] data = new int[] {6, 0, 9};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 6, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort71121222Minus1ThenMinus171121222() {
        int[] data = new int[] {7, 11, 21, 222, -1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-1, 7, 11, 21, 222};
        assertThat(result).containsExactly(expected);
    }
}
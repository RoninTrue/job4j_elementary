package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MatrixSumTest {

    @Test
    public void whenSingleThen10() {
        int[][] array = {{10}};
        int result = MatrixSum.sum(array);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenTwoThen6() {
        int[][] array = {{1, 2}, {1, 2}};
        int result = MatrixSum.sum(array);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenThreeThen7() {
        int[][] array = {{1, 2, 1}, {1, 2, 0}};
        int result = MatrixSum.sum(array);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }
}
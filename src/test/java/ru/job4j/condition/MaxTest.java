package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    public void whenMax1and2Then2() {
        Max max = new Max();
        int one = 1;
        int two = 2;
        int result = max.max(one, two);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax6and4and3Then6() {
        Max max = new Max();
        int one = 6;
        int two = 4;
        int three = 3;
        int result = max.max(one, two, three);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax3and8and12and20Then20() {
        Max max = new Max();
        int one = 3;
        int two = 8;
        int three = 12;
        int four = 20;
        int result = max.max(one, two, three, four);
        int expected = 20;
        assertThat(result).isEqualTo(expected);
    }
}
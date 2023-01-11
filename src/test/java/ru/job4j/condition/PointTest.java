package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import  static org.assertj.core.api.Assertions.assertThat;

public class PointTest {

    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double expected = 2;
        double result = a.distance(b);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when10to40then3() {
        Point a = new Point(1, 0);
        Point b = new Point(4, 0);
        double result = a.distance(b);
        double expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when01to09then8() {
        Point a = new Point(0, 1);
        Point b = new Point(0, 9);
        double result = a.distance(b);
        double expected = 8;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when4and25and4To4and25and16Then12() {
        Point point = new Point(4, 25, 4);
        Point another = new Point(4, 25, 16);
        double result = point.distance3d(another);
        double expected = 12;
        assertThat(result).isEqualTo(expected);
    }
}
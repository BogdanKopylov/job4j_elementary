package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax7To3Then7() {
        int result = Max.max(7, 3);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax6To6Then6() {
        int result = Max.max(6, 6);
        assertThat(result, is(6));
    }

    @Test
    public void whenMax6To6To7Then7() {
        int result = Max.max(6, 6, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax1To3To3Then3() {
        int result = Max.max(1, 3, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax1To8To3Tom5Then8() {
        int result = Max.max(1, 8, 3, -5);
        assertThat(result, is(8));
    }
}
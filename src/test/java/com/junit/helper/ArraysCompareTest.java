package com.junit.helper;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class ArraysCompareTest {

    @Test
    public void testArrays() {
        int[] numbers = {12, 13, 4, 1};
        int[] expected = {1, 4, 12, 13};
        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
    }

    @Test(expected = NullPointerException.class)
    public void testArrayException() {
        int[] numbers = null;
        Arrays.sort(numbers);
    }

    @Test(timeout = 0)
    public void testArrayPerformance() {
        int[] numbers = {1, 5, 2, 1};
        Arrays.sort(numbers);
    }
}

package org.gagan.springboottesting.jUnit.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class AssertEqualTest {

    public boolean isEven(Integer x) {
        return (x % 2 == 0);
    }

    @Disabled
    @Test
    public void addTest() {
        assertEquals(4, 2 + 8 - 4 - 4 + 6 - 2 - 2);
        assertNotNull((isEven(5)) ? 1 : null);
    }

    @Test
    public void secondTest() {
        assertNotEquals(24 * 2, 54 - 28 + 25 - 1 + 48 / 10);
    }

    @ParameterizedTest
    @CsvSource({
            "40,1,23,12",
            "45,5,2,20",
            "24,24,50,0"
    })
    public void CheckData1(int expected, int a, int b, int c) {
        assertEquals(expected, a + b * c);
    }

    enum TestData {
        CASE1(40, 1, 23, 12),
        CASE2(45, 5, 2, 20),
        CASE3(24, 24, 50, 0);

        final int expected;
        final int a;
        final int b;
        final int c;

        TestData(int expected, int a, int b, int c) {
            this.expected = expected;
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    @ParameterizedTest
    @EnumSource(TestData.class)
    public void CheckData2(TestData data) {
        assertEquals(data.expected, data.a + data.b * data.c);
    }

    @ParameterizedTest
    @CsvSource({
            "40,1,23,12",
            "45,5,2,20",
            "24,24,50,0"
    })
    public void CheckData3(int expected, int a, int b, int c) {
        assertEquals(expected, a + b * c);
    }

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10, 12})
    public void CheckData3(int number) {
        assertEquals(0, number % 2);
    }


    @ParameterizedTest
    @MethodSource("provideData")
    public void CheckData3(int[] data) {
        int expected = data[0];
        int a = data[1];
        int b = data[2];
        int c = data[3];
        assertEquals(expected, a + b * c);
    }

    @ParameterizedTest
    @EnumSource(AssertEqualTest.TestData.class)
    public void CheckData4(TestData data) {
        assertEquals(data.expected, data.a + data.b * data.c);
    }

    static Stream<int[]> provideData() {
        return Stream.of(new int[]{40, 1, 23, 12}, new int[]{45, 5, 2, 20}, new int[]{24, 24, 50, 0});
    }
}

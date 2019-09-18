package com.sebastien;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TwoSumTest {

    @ParameterizedTest
    @MethodSource("parameters")
    void twoSum(int[] input, int target, int[] expectedIndecies) {

        TwoSum twoSum = new TwoSum();
        int[] results = twoSum.twoSum(input, target);

        assertThat("Length", results.length, is(2));

        for (int i = 0; i < 2; i++) {
            assertThat("Index", results[i], is(expectedIndecies[i]));
        }
    }

    static Collection parameters() {
        return Arrays.asList(new Object[][] {
                // input, target, expectedIndices
                {new int[] {2, 7, 11, 15}, 9, new int[] {0, 1}},
                {new int[] {2, 7, 4, 8, 7, 6}, 10, new int[] {0, 3}}
        });
    }

}
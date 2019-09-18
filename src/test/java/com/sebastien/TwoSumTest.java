package com.sebastien;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.*;

class TwoSumTest {

    @Test
    void twoSum() {

        TwoSum twoSum = new TwoSum();
        int[] results = twoSum.twoSum(input, target);

        assertThat("Length", results.length, is(2));

        for (int i = 0; i < 2; i++) {
            assertThat("Index", results[i], is(expectedIndeices[i]));
        }

    }

    int[] input = new int[] {2, 7, 11, 15};
    int target = 9;
    int[] expectedIndeices = new int[] {0, 1};
}
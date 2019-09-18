package com.sebastien;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];


        for (int i = 0 ; i < nums.length; i++) {
            for (int k = 1; k < nums.length; k++) {
                int a = nums[i];
                int b = nums[k];

                if (a + b == target) {
                    results[0] = i;
                    results[1] = k;
                    break;
                }
            }
        }

        return results;
    }
}

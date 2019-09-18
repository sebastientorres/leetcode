package com.sebastien;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];

        boolean found = false;

        for (int i = 0 ; i < nums.length; i++) {
            for (int k = 1; k < nums.length; k++) {
                int a = nums[i];
                int b = nums[k];

                if (a + b == target) {
                    results[0] = i;
                    results[1] = k;
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }

        return results;
    }
}

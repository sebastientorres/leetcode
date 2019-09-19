package com.sebastien;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];

        boolean found = false;

        for (int i = 0; i < nums.length && !found; i++) {
            for (int j = i+1; j< nums.length; j++) {
                int a = nums[i];
                int b = nums[j];

                if(a+b == target) {
                    results[0] = i;
                    results[1] = j;
                    found = true;
                    break;
                }
            }
        }

        return results;
    }
}

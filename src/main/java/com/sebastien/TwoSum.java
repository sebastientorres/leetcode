package com.sebastien;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j< nums.length; j++) {
                int a = nums[i];
                int b = nums[j];

                if(a+b == target) {
                    return new int[] {i, j};
                }
            }
        }

        return new int[] {-1, -1};
    }
}

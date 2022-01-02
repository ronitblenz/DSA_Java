package com.ronit;

public class _1920_BuildArrayFromPermutation {
    public static class Solution1 {
        public int[] buildArray(int[] nums) {
            int n = nums.length;
            int[] ans = new int[n];
            for (int i = 0; i < n; i++) {
                ans[i] = nums[nums[i]];
            }
            return ans;
        }
    }
}
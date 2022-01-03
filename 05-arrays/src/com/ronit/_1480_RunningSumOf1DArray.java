package com.ronit;

public class _1480_RunningSumOf1DArray {
    class Solution {
        public int[] runningSum(int[] nums) {
            int n=nums.length;
            for(int i=1;i<n; i++)
            {
                nums[i]+=nums[i-1];
            }
            return nums;
        }
    }
}

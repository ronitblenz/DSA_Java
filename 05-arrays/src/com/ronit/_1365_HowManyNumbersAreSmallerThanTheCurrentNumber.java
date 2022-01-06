package com.ronit;

public class _1365_HowManyNumbersAreSmallerThanTheCurrentNumber {
    class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int n=nums.length;
            int[] ans=new int [n];
            int[] temp=new int [101];
            for(int i=0;i<n;i++)
            {
                temp[nums[i]]++;
            }
            for(int i=1;i<101;i++)
            {
                temp[i]+=temp[i-1];
            }
            for(int i=0;i<n;i++)
            {
                if(nums[i]==0)
                {
                    ans[i]=0;
                }
                else
                {
                    ans[i]=temp[nums[i]-1];
                }
            }
            return ans;
        }
    }
}

package com.ronit;

public class _441_ArrangingCoins {
    class Solution {
        public int arrangeCoins(int n) {
            int left = 0;
            int right = n;
            while(left <= right){
                int pivot = left + (right - left) / 2;
                int coinsUsed = pivot * (pivot + 1)/2;
                if(coinsUsed == n){
                    return (int)pivot;
                }
                if(n < coinsUsed){
                    right = pivot-1;
                }
                else{
                    left = pivot + 1;
                }
            }
            return right;
        }
    }
}

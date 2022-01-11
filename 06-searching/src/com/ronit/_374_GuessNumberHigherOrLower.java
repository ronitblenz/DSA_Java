package com.ronit;
/*
  Forward declaration of guess API.
  @param  num   your guess
  @return      -1 if num is lower than the guess number
 		        1 if num is higher than the guess number
                otherwise return 0
  int guess(int num);
 */

public class _374_GuessNumberHigherOrLower {
    public class Solution extends GuessGame {
        public int guessNumber(int n) {
            int i = 1, j = n;
            while(i < j) {
                int mid = i + (j - i) / 2;
                if(guess(mid) == 0) {
                    return mid;
                } else if(guess(mid) == 1) {
                    i = mid + 1;
                } else {
                    j = mid;
                }
            }
            return i;
        }
    }
}

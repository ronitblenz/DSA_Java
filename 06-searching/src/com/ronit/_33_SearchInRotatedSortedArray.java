package com.ronit;

public class _33_SearchInRotatedSortedArray {
    class Solution {
        public int search(int[] nums, int target) {

            int lo=0, hi=nums.length-1;


            int smallestNumberIndex = 0;

            //Get the position of the Smallest Number in the array
            while(lo<hi){

                //Check for the sudden change in the order of the number
                //That will happen **only once or 0 ("nums is possibly rotated")** times like **[1,3]**
                //OR At the point like this ones [9, 10, **11, 0,** 1, 2]

                if(nums[lo+1] < nums[lo]){smallestNumberIndex=lo+1; break;}

                if(nums[hi-1] > nums[hi]){smallestNumberIndex=hi;  break;}


                lo++; hi--; //Keep the pointers coming towards each other until the smallest no. found
            }


            //If the array is rotated, always the number before the smallest one will be the largest one (Initially the array was sorted in ascending order)
            //(Exception- smallest no. at 0th position i.e. no rotation of the array happened in the first place)
            int largestNumberIndex = smallestNumberIndex - 1;

            //Solution initialized
            int sol = -1;

            //If target is the smallest number itself.
            if(target == nums[smallestNumberIndex]){
                sol = smallestNumberIndex;


                // **largestNumberIndex >=0**  -> To chekc for the exception- smallest no. at 0th position i.e. no rotation of the array happened
                //  **(target>=nums[0]  &&  target<=nums[largestNumberIndex])**  -> If target is in between 0th Index and Index of LargestNumber, search on left side.

            }else if( largestNumberIndex >=0 &&     (target>=nums[0]  &&  target<=nums[largestNumberIndex])  ){
                //search in the left
                sol = binarySearch(nums , 0 , largestNumberIndex , target);


                //If target is in between Index of Smallest Number and last index, search on right side.
            }else if(target > nums[smallestNumberIndex] && target <= nums[nums.length-1]){
                //search in the right
                sol = binarySearch(nums , smallestNumberIndex , nums.length-1 , target);
            }

            return sol;
        }






        //LeftSide OR RightSide.. both are itself sorted.. so we can apply normal binary search
//Normal binary search given the start and end Index
        public int binarySearch(int ar[] , int f , int l , int t){
            int mid = (f+l)/2;

            while(f <= l){
                if(ar[mid] < t){
                    f = mid+1;
                }else if(ar[mid] == t){
                    return mid;
                }else{
                    l = mid -1;
                }

                mid = (f+l)/2;
            }

            if(f > l)mid = -1;

            return mid;
        }
    }
}

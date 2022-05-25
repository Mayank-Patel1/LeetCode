/*
Naive approach
class Solution {
    public int findDuplicate(int[] nums) {
        int size = nums.length;
        for(int i=0; i<size ;i++){
            for(int j=i+1; j<size; j++){
                if(nums[i] == nums[j]){
                    return nums[j];
                }
            }
        }
        return -2;
    }
}
*/

// Since the max number in the array must be smaller then n (size of array) we can use hare and tortoise method.

TODO

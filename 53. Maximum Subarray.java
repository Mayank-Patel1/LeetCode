// 53. Maximum Subarray
class Solution {
    public int maxSubArray(int[] nums) {
        int max = 0;
        int ans = nums[0];
        int n = nums.length;
        for(int i=0; i<n ;i++){
            max += nums[i];
            if( max > ans){
                ans = max;
            }
            if (max < 0){
                max=0;
            }
        }
        return ans;
    }
}

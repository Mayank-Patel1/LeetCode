// 152. Maximum Product Subarray
class Solution {
    public int maxProduct(int[] nums) {
        int ans = nums[0];
        int n = nums.length;
        int max = ans;
        int min = ans;
        for(int i=1; i<n;i++){
            if(nums[i] < 0){
                int temp;
                temp = max;
                max = min;
                min = temp;
            }
            max = Math.max(nums[i], max*nums[i]);
            min = Math.min(nums[i], min*nums[i]);
            ans = Math.max(ans, max);
        }
        return ans;   
    }
}

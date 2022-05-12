//303. Range Sum Query - Immutable

class NumArray {
    public int[] sums;
    public NumArray(int[] nums) {
        this.sums = new int[nums.length];
        int sum = 0;
        for(int i=0; i<nums.length;i++){
            sum += nums[i];
            sums[i] = sum;
        }
        return;
    }
    
    public int sumRange(int left, int right) {
        if(left == 0) return sums[right];
        int answer = sums[right] - sums[left-1];
        return answer;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */

// 704. Binary Search
class Solution {
    public int search(int[] nums, int target) {
        int right = nums.length-1;
        int left = 0;
        int pivot;
        while(left <= right){
            pivot = (right-left)/2 + left;
            System.out.println(pivot + " " + right +" " + left);
            if(nums[pivot] == target){
                return pivot;
            }
            if(nums[pivot] < target){
                left = pivot + 1;
            } else {
                right = pivot - 1;
            }
        }
        return -1;
    }
}

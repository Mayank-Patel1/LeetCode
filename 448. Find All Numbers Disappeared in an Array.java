// 448. Find All Numbers Disappeared in an Array
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(nums[Math.abs(nums[i])-1]>0){
                nums[Math.abs(nums[i])-1] *= -1;
            }
        }
        List<Integer> answer= new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] > 0){
                answer.add(i+1);
            }
        }
        return answer;
    }
}

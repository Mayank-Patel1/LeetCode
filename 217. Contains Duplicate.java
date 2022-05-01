// 217. Contains Duplicate
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> indexMap  = new HashMap<Integer, Integer>();
        for( int i=0; i<nums.length; i++){
            if(indexMap.containsKey(nums[i])){
                return true;
            }
            indexMap.put(nums[i], i);
        }
        return false;
    }
}

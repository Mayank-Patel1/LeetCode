// 852. Peak Index in a Mountain Array
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        for(int i=0; i<arr.length ;i++){
            if(arr[i] > arr[1+i]){ return i;}
        }
        return -11;
    }
}

// Log n approach: 
// TODO

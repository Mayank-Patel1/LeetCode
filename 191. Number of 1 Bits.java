// 191. Number of 1 Bits

public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int answer = 0;
        while(n!=0){
            if(1==(1 & n)){
                n >>>= 1; // Does not work with ">>" because ">>" keeps the sign bit the same whereas ">>>" moves all bits
                answer += 1;
            } else {
                n >>>=1;
            }
        }
        return answer;
    }
}

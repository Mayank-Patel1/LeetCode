// 338. Counting Bits

class Solution {
    public int[] countBits(int n) {
        int[] answer = new int[n+1];
        answer[0] = 0;
        for(int i=1; i<=n;i++){
            answer[i] = 1 + answer[i & i-1]; // Dynamic Programming
        }
        return answer;
    }
}

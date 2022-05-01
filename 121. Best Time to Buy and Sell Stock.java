// 121. Best Time to Buy and Sell Stock.java

class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;
        for( int i=0; i<prices.length ;i++){
            if( min > prices[i]){
                min = prices[i];
            }
            maxProfit = Math.max(prices[i]-min, maxProfit);
        }
        return maxProfit;
    }
}

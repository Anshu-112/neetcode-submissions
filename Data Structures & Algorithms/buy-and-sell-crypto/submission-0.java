class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int best = prices[0];
        for(int i=1;i<prices.length;i++){
            if(best<prices[i]){
             profit = Math.max(profit,prices[i]-best);
            }

            best = Math.min(best , prices[i]);


        }
        return profit;
        
    }
}

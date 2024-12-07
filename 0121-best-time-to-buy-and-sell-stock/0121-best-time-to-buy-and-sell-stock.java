    class Solution {
        public int maxProfit(int[] prices) {
            
            int low = Integer.MAX_VALUE;
            int totP = 0;
            int todP = 0;
            
            for(int i = 0 ; i < prices.length ; i++)
            {
                if(prices[i] < low)
                {
                    low = prices[i];
                }
                
                todP = prices[i] - low;
                if(totP < todP)
                {
                    totP = todP;
                }
            }
            
            return totP;
        }
    }
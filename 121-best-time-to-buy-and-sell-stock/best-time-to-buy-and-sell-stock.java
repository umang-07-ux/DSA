class Solution {
    public int maxProfit(int[] prices) {
        int l = 0;
        int res = 0;

        for(int i = 0; i < prices.length; i++) {

            if(prices[i] < prices[l]) {
                l = i;
            }

            res = Math.max(res, prices[i] - prices[l]);
        }

        return res;
    }
}
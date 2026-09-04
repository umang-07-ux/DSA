class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[] suffixmax=new int[n];
        suffixmax[n-1]=prices[n-1];
        int res=0;
        int min=Integer.MAX_VALUE;
        for(int i=n-2;i>=0;i--) {
            suffixmax[i]=Math.max(suffixmax[i+1],prices[i]);
        }
        for(int i=0;i<n;i++) {
            min=Math.min(prices[i],min);
            int max=suffixmax[i];
            if(max>min) {
                res=Math.max(res,(max-min));
            }
        }
        return res;
    }
}
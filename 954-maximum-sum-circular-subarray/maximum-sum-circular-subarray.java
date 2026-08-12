class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n=nums.length;
        int minsum=nums[0];
        int maxsum=nums[0];
        int mini=nums[0];
        int maxi=nums[0];
        int sum=nums[0];
        for(int i=1; i<n; i++) {
            sum+=nums[i];
            maxi=Math.max(maxi+nums[i],nums[i]);
            mini=Math.min(mini+nums[i],nums[i]);
            minsum=Math.min(mini,minsum);
            maxsum=Math.max(maxi,maxsum);
        }       
        if(maxsum<0) {
            return maxsum;
        }
        int circularsum=sum-minsum;
        return Math.max(circularsum,maxsum);
    }
}
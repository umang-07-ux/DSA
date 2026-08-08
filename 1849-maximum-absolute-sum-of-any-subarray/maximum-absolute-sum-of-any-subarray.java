class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n=nums.length;
        int ans=Math.abs(nums[0]);
        int minsum=nums[0];
        int maxsum=nums[0];
        for (int i=1;i<n;i++) {
            minsum=Math.min(minsum+nums[i],nums[i]);
            maxsum=Math.max(maxsum+nums[i],nums[i]);
            int n1=Math.abs(minsum);
            int n2=Math.abs(maxsum);
            ans=Math.max(ans,Math.max(n1,n2));
        }
        return ans;
    }
}
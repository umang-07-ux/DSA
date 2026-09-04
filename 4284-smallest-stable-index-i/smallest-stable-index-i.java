class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<n;i++) {
            max=Math.max(max,nums[i]);
            int j=i;
            int min=Integer.MAX_VALUE;
            while(j<n) {
                min=Math.min(min,nums[j]);
                j++;
            }
            if(max-min<=k) {
                index=i;
                break;
            }
        }
        return index;
    }
}
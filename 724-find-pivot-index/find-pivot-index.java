class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int index=-1;
        int prefix=0;
        int suffix=0;
        int sum=0;
        for (int i=0;i<n;i++) {
            sum+=nums[i];
        }
        for(int j=0;j<n;j++) {
            if(j>0) {
                prefix+=nums[j-1];
            }
            suffix=sum-nums[j]-prefix;
            if(prefix==suffix) {
                index=j;
                break;
            }
        }
        return index;
    }
}
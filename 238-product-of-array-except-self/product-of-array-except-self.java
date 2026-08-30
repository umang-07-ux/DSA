class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int product1=1;
        int product2=1;
        int zeros=0;
        for(int i=0;i<n;i++) {
            product1*=nums[i];
            if(nums[i]==0) {
                zeros++;
                continue;
            }
            product2*=nums[i];
        }
        for(int j=0;j<n;j++) {
            if(zeros>1) {
                nums[j]=0;
            }
            else if(zeros==1 && nums[j]==0) {
                nums[j]=product2;
            }
            else {
                nums[j]=product1/nums[j];
            }
        }
        return nums;
    }
}
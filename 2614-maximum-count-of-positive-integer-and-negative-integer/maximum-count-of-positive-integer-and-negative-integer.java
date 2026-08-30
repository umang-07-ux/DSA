class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int negatives=0;
        int positives=0;
        int low=0,high=n-1;
        while(low<=high) {
            int mid=low+(high-low)/2;
            if(nums[mid]>=0) {
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        negatives=high+1;
        high=n-1;
        low=0;
        while(low<=high) {
            int mid=low+(high-low)/2;
            if(nums[mid]<=0) {
                low=mid+1;
            }
            else {
                high=mid-1;
            }
        }
        positives=n-low;
        return Math.max(positives,negatives);
    }
}
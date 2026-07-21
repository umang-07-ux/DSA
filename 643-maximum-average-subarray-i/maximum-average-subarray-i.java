class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<k;i++) {
            sum+=nums[i];
        }
        double avg=(double)sum/k;
        int low=0,high=k;
        while(high<n) {
            sum+=nums[high]-nums[low];
            double avg2=(double)sum/k;
            avg=Math.max(avg2,avg);
            low++;
            high++;
        }
        return avg;
        
    }
}
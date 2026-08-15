class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> freq=new HashMap<>();
        int sum=0;
        int res=0;
        freq.put(0,1);
        for(int i=0;i<n;i++) {
            sum+=nums[i];
            int remaining=sum-k;
            int f=freq.getOrDefault(remaining,0);
            freq.put(sum,freq.getOrDefault(sum,0)+1);
            
            res+=f;
        }
        return res;
    }
}
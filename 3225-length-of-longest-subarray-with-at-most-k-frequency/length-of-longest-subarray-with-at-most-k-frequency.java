class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        int n=nums.length;
        int low=0;
        int res=-1;
        Map<Integer,Integer> freq=new HashMap<>();
        for(int high=0;high<n;high++) {
            freq.put(nums[high],freq.getOrDefault(nums[high],0)+1);
            while(freq.get(nums[high])>k) {
                int leftNum=nums[low];
                freq.put(leftNum,freq.get(leftNum)-1);
                if(freq.get(leftNum)==0) {
                    freq.remove(leftNum);
                }
                low++;
            }
            if(freq.get(nums[high])<=k) {
                res=Math.max(res,high-low+1);
            }
        }
        return res;
    }
}
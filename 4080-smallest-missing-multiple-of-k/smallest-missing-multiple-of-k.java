class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++) {
            map.put(nums[i],i);
        }
        int i=k;
        int max=Integer.MAX_VALUE;
        while(i<max) {
            if(!map.containsKey(i)) {
                return i;
            }
            i=i+k;
        }
        return -1;
    }
}
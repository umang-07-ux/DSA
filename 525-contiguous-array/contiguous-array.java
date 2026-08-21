class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> map=new HashMap<>();
        int res=0;
        int zeros=0,ones=0;
        for(int i=0;i<n;i++) {
            if(nums[i]==0) {
                zeros++;
            }
            else if(nums[i]==1) {
                ones++;
            }
            int difference=zeros-ones;
            if(difference==0) {
                res=Math.max(res,i+1);
            }
            if(map.containsKey(difference)) {
                int maxlength=i-map.get(difference);
                res=Math.max(res,maxlength);
            }
            else {
                map.put(difference,i);
            }
        }
        return res;
    }
}
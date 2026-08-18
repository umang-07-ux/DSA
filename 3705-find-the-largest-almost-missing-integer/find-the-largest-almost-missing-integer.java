class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        Map<Integer,Integer> freq=new HashMap<>();
        int low=0,high=k-1;
        int x=-1;
        while(high<n) {
            Set<Integer> set = new HashSet<>();
            for (int i = low; i <= high; i++) {
                set.add(nums[i]);
            }
            for (int num : set) {
                freq.put(num, freq.getOrDefault(num, 0) + 1);
            }
            low++;
            high++;
        }
        for(int num:freq.keySet()) {
            if(freq.get(num)==1 && num>x) {
                x=num;
            }
        }
        return x;
    }
}
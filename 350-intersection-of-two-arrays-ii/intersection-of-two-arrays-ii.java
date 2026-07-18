class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int n=nums1.length,m=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list=new ArrayList<>();
        int i=0,j=0;
        while(i<n && j<m) {
            if(nums1[i]==nums2[j]) {
                list.add(nums1[i]);
                j++;
                i++;
            }
            else if(nums1[i]<nums2[j]) {
                i++;
            }
            else {
                j++;
            }
        }
        int[] ans=new int[list.size()];
        for(int k=0;k<ans.length;k++) {
            ans[k]=list.get(k);
        }
        return ans;
    }
}
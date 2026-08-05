class Solution {
    public int maximumSum(int[] arr) {
        int n=arr.length;
        int NoDelete=arr[0];
        int OneDelete=Integer.MIN_VALUE;
        int ans=arr[0];
        for(int i=1;i<n;i++) {
            int PrevOneDelete=OneDelete;
            int PrevNoDelete=NoDelete;
            NoDelete=Math.max(NoDelete+arr[i],arr[i]);
            int v1=0;
            if(OneDelete==Integer.MIN_VALUE) {
                v1=arr[i];
            }
            else {
                v1=PrevOneDelete+arr[i];
            }
            OneDelete=Math.max(v1,PrevNoDelete);
            ans=Math.max(ans,Math.max(OneDelete,NoDelete));
        }
        return ans;
    }
}
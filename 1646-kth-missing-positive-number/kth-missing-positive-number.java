class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int low=0,high=n-1;
        while(low<=high) {
            int mid=low+(high-low)/2;
            int CorrectNo=mid+1;
            int missing=arr[mid]-CorrectNo;
            if(missing>=k) {
                high=mid-1;
            }
            else {
                low=mid+1;
            }
        }
        return high+1+k;
    }
}
class Solution {
    public int findGCD(int[] nums) {
        int n=nums.length;
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        int gcd=0;
        for(int i=0;i<n;i++) {
            if(nums[i]>largest) {
                largest=nums[i];
            }
            if(nums[i]<smallest) {
                smallest=nums[i];
            }
        }
        return gcd(largest,smallest);
        
    }
    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
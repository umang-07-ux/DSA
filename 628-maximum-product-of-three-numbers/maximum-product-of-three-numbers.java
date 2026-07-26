class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        int n1=Integer.MIN_VALUE,n2=Integer.MIN_VALUE,n3=Integer.MIN_VALUE;
        int m1=Integer.MAX_VALUE,m2=Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            int x=nums[i];
            if(x > n1){
                n3 = n2;
                n2 = n1;
                n1 = x;
            }
            else if(x > n2){
                n3 = n2;
                n2 = x;
            }
            else if(x > n3){
                n3 = x;
            }
            if(x < m1){
                m2 = m1;
                m1 = x;
            }
            else if(x < m2){
                m2 = x;
            }
        }
        int product1 = m1 * m2 * n1;
        int product2 = n1 * n2 * n3;

        return Math.max(product1, product2);
    }
}
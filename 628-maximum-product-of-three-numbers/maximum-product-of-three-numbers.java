class Solution {
    public int maximumProduct(int[] nums) {
        int n=nums.length;
        int max=Integer.MIN_VALUE,secondmax=Integer.MIN_VALUE,thirdmax=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE,secondmin=Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            int x=nums[i];
            if(x > max){
                thirdmax = secondmax;
                secondmax = max;
                max = x;
            }
            else if(x > secondmax){
                thirdmax = secondmax;
                secondmax = x;
            }
            else if(x > thirdmax){
                thirdmax = x;
            }
            if(x < min){
                secondmin = min;
                min = x;
            }
            else if(x < secondmin){
                secondmin = x;
            }
        }
        int product1 = min * secondmin * max;
        int product2 = max * secondmax * thirdmax;

        return Math.max(product1, product2);
    }
}
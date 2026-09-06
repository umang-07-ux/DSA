class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int i=0,j=n-1;
        int maxwater=0;
        while(i<j) {
            int indexdif=j-i;
            int min=Math.min(height[j],height[i]);
            maxwater=Math.max(maxwater,(min*indexdif));
            if(height[i]>height[j]) {
                j--;
            }
            else if(height[i]<height[j]) {
                i++;
            }
            else {
                i++;
                j--;
            }
        }
        return maxwater;
    }
}
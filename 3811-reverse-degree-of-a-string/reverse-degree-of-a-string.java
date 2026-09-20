class Solution {
    public int reverseDegree(String s) {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++) {
           int reverseValue=26-(s.charAt(i)-'a');
            int multi=(i+1)*reverseValue;
            sum+=multi;
        }
        return sum;
    }
}
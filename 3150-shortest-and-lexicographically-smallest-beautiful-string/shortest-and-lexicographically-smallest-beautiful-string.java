class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n=s.length();
        String ans="";
        int ones=0;
        int low=0;
        for(int high=0;high<n;high++) {
            char c=s.charAt(high);
            if(c=='1') {
                ones++;
            }
            while (ones > k) {
                if (s.charAt(low) == '1') {
                    ones--;
                }
                low++;
            }
            if(ones==k) {
                while(s.charAt(low)=='0') {
                    low++;
                }
            
                String current=s.substring(low,high+1);
                if(ans.equals("")) {
                    ans=current;
                }
                else if(current.length()<ans.length()) {
                    ans=current;
                }
                else if(current.length()==ans.length() && current.compareTo(ans)<0) {
                    ans=current;
                }
            }
        }
        return ans;
    }
}
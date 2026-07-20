class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int low=0;
        int res=0;
        Map<Character,Integer> freq=new HashMap<>();
        for(int high=0;high<n;high++) {
            char c=s.charAt(high);
            freq.put(c,freq.getOrDefault(c,0)+1);
            while(freq.get(c)>1) {
                char leftChar=s.charAt(low);
                freq.put(leftChar,freq.getOrDefault(leftChar,0)-1);
                low++;
            }
            res=Math.max(res,high-low+1); 
        } 
        return res;
    }
}
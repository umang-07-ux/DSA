class Solution {
    public int characterReplacement(String s, int k) {
        int n=s.length();
        int low=0;
        int res=Integer.MIN_VALUE;
        int maxfreq=0;
        Map<Character,Integer> freq=new HashMap<>();
        for(int high=0;high<n;high++) {
            char c=s.charAt(high);
            freq.put(c,freq.getOrDefault(c,0)+1);
            maxfreq=Math.max(maxfreq,freq.get(c));
            int len=high-low+1;
            while(len-maxfreq>k) {
                char leftChar=s.charAt(low);
                freq.put(leftChar,freq.getOrDefault(leftChar,0)-1);
                low++;
                len=high-low+1;
            }
            res=Math.max(res,high-low+1);
        }
        return res;
    }
}
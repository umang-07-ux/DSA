class Solution {
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int low=0;
        int res=-1;
        HashMap<Character,Integer> freq=new HashMap<>();
        for(int high=0;high<n;high++) {
            char c=s.charAt(high);
            freq.put(c,freq.getOrDefault(c,0)+1);
            while(freq.get(c)>2) {
                char newChar=s.charAt(low);
                freq.put(newChar,freq.getOrDefault(newChar,0)-1);
                low++;
            }
            res=Math.max(res,high-low+1);
        }
        return res;
    }
}
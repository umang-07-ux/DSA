class Solution {
    public int totalFruit(int[] fruits) {
        int n=fruits.length;
        int low=0;
        int res=-1;
        Map<Integer,Integer> freq=new HashMap<>();
        for(int high=0;high<n;high++) {
            freq.put(fruits[high],freq.getOrDefault(fruits[high],0)+1);
            while(freq.size()>2) {
                int leftNum=fruits[low];
                freq.put(leftNum,freq.getOrDefault(leftNum,0)-1);
                if(freq.get(leftNum)==0) {
                    freq.remove(leftNum);
                }
                low++;
            }
            if(freq.size()<=2) {
                res=Math.max(res,high-low+1);
            }
        }
        return res;
    }
}
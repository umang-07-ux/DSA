class Solution {
    public int[] resultArray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i=2;i<n;i++) {
            if(arr1.get(arr1.size()-1)>arr2.get(arr2.size()-1)) {
                arr1.add(nums[i]);
            }
            else if (arr1.get(arr1.size()-1)<arr2.get(arr2.size()-1)) {
                arr2.add(nums[i]);
            }
        }
        for(int j=0;j<arr1.size();j++) {
            nums[j]=arr1.get(j);
        }
        int total=arr1.size()+arr2.size();
        int index=0;
        for(int k=arr1.size();k<total;k++) {
            nums[k]=arr2.get(index);
            index++;
        }
        return nums;
    }
}
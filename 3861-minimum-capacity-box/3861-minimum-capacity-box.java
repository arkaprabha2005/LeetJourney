class Solution {
    public int minimumIndex(int[] nums, int itemSize) {
        int min=101;
        int m=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=itemSize && nums[i]-itemSize<min){
            min=nums[i]-itemSize;
             m=i;
            }
            
        }   
        return m;
    }
}
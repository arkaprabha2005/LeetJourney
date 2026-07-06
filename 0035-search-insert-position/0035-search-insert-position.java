class Solution {
    public int searchInsert(int[] nums, int target) {
        int pos=0;
        int high=nums.length-1;
        int low=0;
        while(low<=high){
            pos=low+(high-low)/2;
            if(nums[pos]==target){
                return pos;
            }
            else if(nums[pos]>target){
                high=pos-1;
            }
            else low=pos+1;
        }
        return low;
    }
}
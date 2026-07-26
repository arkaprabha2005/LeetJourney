class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int l=nums.length;
        if(nums[0]*nums[1]>nums[l-2]*nums[l-3] && nums[l-1]>0){
            return nums[0]*nums[1]*nums[l-1];
        }
        return nums[l-1]*nums[l-2]*nums[l-3];
    }
}//[-4,-3,-2,-1]
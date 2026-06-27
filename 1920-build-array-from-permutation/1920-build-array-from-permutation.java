class Solution {
    public int[] buildArray(int[] nums) {
        int[] n2=Arrays.copyOf(nums,nums.length);
        for(int i=0;i<nums.length;i++){
            nums[i]=n2[n2[i]];
        }   
        return nums;
    }
}
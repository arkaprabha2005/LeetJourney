class Solution {
    public int[] buildArray(int[] nums) {
        //int[] n2=Arrays.copyOf(nums,nums.length);
        for(int i=0;i<nums.length;i++){
            nums[i]=(nums[nums[i]]%nums.length)*nums.length+nums[i];
        }   

        for(int i=0;i<nums.length;i++){
            
                nums[i]=nums[i]/nums.length;
            
        }
        return nums;
    }
}
class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        
        
        int a=nums[0];
        int b=Math.max(nums[1],nums[0]);
        for(int i=2;i<nums.length;i++){
            int temp=b;
            
                b=Math.max(a+nums[i],b);
            
            
            a=temp;
        }
        return b;
    }
}
class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=nums[0];
        int min=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            min=Math.min(min,nums[i]);
        }
        //int ans=max-min;
        int i=0;
        while(i<nums.length){
            if(max-min<=k){
                return i;
            }
            max = Math.max(max, nums[i]);
            min = Integer.MAX_VALUE;
            for(int j=i+1;j<nums.length;j++){
                min=Math.min(min,nums[j]);
            }
            
            //ans=max-min;
            i++;
        }
        return -1;
    }
}
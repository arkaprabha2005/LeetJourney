class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max=nums[0];
        int min=Integer.MAX_VALUE;
        int[] min_arr=new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]<min){
                min=nums[i];
            }
            min_arr[i]=min;
        }
        int i=0;
        while(i<nums.length){
            max = Math.max(max, nums[i]);
            if(max-min_arr[i]<=k){
                return i;
            }
            i++;
        }
        return -1;
    }
}
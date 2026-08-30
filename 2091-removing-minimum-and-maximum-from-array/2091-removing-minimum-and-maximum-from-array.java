class Solution {
    public int minimumDeletions(int[] nums) {
        int max=0;
        int min=0;
        if(nums.length==1) return 1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[max]){
                max=i;
            }
            if(nums[i]<nums[min]){
                min=i;
            }
        }
        int left=Math.max(max,min)+1;
        int right=nums.length-Math.min(max,min);
        int both=Math.min(max,min)+(nums.length-Math.max(max,min))+1;
        return Math.min(both,Math.min(left,right));
    }
}
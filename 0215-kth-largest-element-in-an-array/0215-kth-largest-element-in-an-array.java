class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int found=1;
        int max=0;
        for(int i=nums.length-1;i>=0;i--){
            if(found<k){
                found++;
            }
            else{
                max=nums[i];
                break;
            }
        }
        return max;

    }
}
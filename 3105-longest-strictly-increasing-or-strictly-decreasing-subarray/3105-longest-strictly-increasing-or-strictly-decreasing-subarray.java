class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        //if(nums.length==1 || nums.length==2) return nums.length;
        int max=1;
        int count=1;
        int mode=0;//0 increasing
        for(int i=0;i<nums.length-1;i++){
           if(nums[i+1] > nums[i]) {
                if(mode == 0) {
                    count++;
                } else {
                    count = 2;
                    mode = 0;
                }
            }

            else if(nums[i+1] < nums[i]) {
                if(mode == 1) {
                    count++;
                } else {
                    count = 2;
                    mode = 1;
                }
            }

            else {
                count = 1;
                mode = 0;
            }
            max=Math.max(count,max);
        }
        return max;
    }
}
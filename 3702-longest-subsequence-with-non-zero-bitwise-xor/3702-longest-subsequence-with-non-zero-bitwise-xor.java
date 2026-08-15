class Solution {
    public int longestSubsequence(int[] nums) {
        int y=0;
        boolean nonZero=false;
        for(int i:nums){
            y^=i;
            if(i!=0){
                nonZero=true;
            }
        }
        if(y!=0){
            return nums.length;
        }
        if(nonZero) return nums.length-1;
        return 0;
    }
}
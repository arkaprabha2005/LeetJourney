class Solution {
    public int smallestIndex(int[] nums) {
        int bound=Math.min(nums.length,28);
        for(int i=0;i<bound;i++){
            int temp=nums[i];
            int sum=0;
            while(temp>0){
                sum+=temp%10;
                temp/=10;
            }
            if(i==sum) return i;
        }
        return -1;
    }
}
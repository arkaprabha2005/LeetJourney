class Solution {
    public int[] runningSum(int[] nums) {
        int[] result=new int[nums.length];//make a temporary array to store for better understanding
        int temp=0;
        for(int i=0;i<nums.length;i++){
            temp=temp+nums[i];
            result[i]=temp;
        }
        return result;
    }
}
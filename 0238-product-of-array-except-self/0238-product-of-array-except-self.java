class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pref=new int[nums.length+1];   
        int [] next=new int[nums.length+1];
        pref[0]=next[nums.length]=1;
        for(int i=0;i<nums.length;i++){
            pref[i+1]=pref[i]*nums[i];
            next[nums.length-1-i]=next[nums.length-i]*nums[nums.length-1-i];
        }

        for(int i=0;i<nums.length;i++){
            nums[i]=pref[i]*next[i+1];
        }
        return nums;
    }

}
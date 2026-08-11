class Solution {
    public int missingInteger(int[] nums) {
        int[] arr=new int[51];
        for(int i:nums){
            arr[i]++;
        }
        int sum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                sum+=nums[i];
            }
            else{
                break;
            }
            
        }

        while(sum<arr.length && arr[sum]!=0){
            sum++;
        }
        return sum;
    }
}
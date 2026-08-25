class Solution {
    public int missingMultiple(int[] nums, int k) {
        int[] arr=new int[101];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        int i=1;
        while(true){
            
            if(k*i>100 || arr[k*i]==0){
                return k*i;
            }
            i++;
        }

    }
}
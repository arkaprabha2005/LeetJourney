class Solution {
    public int[] resultArray(int[] nums) {
        int[] arr1=new int[nums.length];
        int[] arr2=new int[nums.length];
        int a1=0;
        int a2=0;
        arr1[a1++]=nums[0];
        arr2[a2++]=nums[1];
        for(int i=2;i<nums.length;i++){
            if(arr1[a1-1]>arr2[a2-1]){
                arr1[a1++]=nums[i];
            } 
            else arr2[a2++]=nums[i];
        }
        int[] result=new int[nums.length];
        for(int j=0;j<a1;j++) result[j]=arr1[j];

        for(int j=0;j<a2;j++) result[a1+j]=arr2[j];
        
        return result;
        
    }
}
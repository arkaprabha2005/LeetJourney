class Solution {
    public int findNumbers(int[] nums) {
        int evenCount=0;//initializing
        int digits=0;//initializing
        for(int i=0;i<nums.length;i++){
            int temp=nums[i];//temporary storing the number
            while(temp!=0){
                temp=temp/10;
                digits++;//Counting no. of digits
            }
            if(digits%2==0){
                evenCount++;//if no. of digits even add to even Counter
            }
            digits=0;//resetting the digit counter
        }
    return evenCount;
    }
}
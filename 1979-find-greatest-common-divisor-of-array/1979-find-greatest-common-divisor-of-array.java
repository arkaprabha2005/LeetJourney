class Solution {
    public int findGCD(int[] nums) {
        int a=nums[0];
        int b=nums[0];
        for(int num:nums){
        b=Math.min(num,b);
        a=Math.max(num,a);

        }
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        return a;
    }
}
class Solution {
    public int getSum(int a, int b) {
        int sum=a^b;//get sum
        int carry=(a&b)<<1;//get carry
        while(carry!=0){
            int ass=sum;
            sum=sum^carry;//add the carry 
            carry=(ass&carry)<<1;//what if again carry is generated? use while
        }
        return sum;
    }
}
class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long num=0;
        while(n>0){
            if(n%10==0){
                n=n/10;
            }
            else{
                sum+=n%10;
                num=num*10+n%10;
                n=n/10;
            }
        }
        long f=0;
        while(num>0){
            f=f*10+num%10;
            num=num/10;
        }
        return f*sum;
    }
}
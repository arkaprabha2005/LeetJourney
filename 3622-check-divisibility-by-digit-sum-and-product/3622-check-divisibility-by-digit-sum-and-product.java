class Solution {
    public boolean checkDivisibility(int n) {
        int t=n;
        long sum=0;
        long prod=1;
        while(n>0){
            sum+=n%10;
            prod*=n%10;
            n/=10;
        }

        if(t%(sum+prod)==0) return true;
        else return false;
    }
}
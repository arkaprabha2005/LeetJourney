class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int s=n;
            int prod=1;
            while(s>0){
                prod*=s%10;
                s/=10;
            }
            if(prod%t==0){
                return n;
            }
            n++;
        }
        
    }
}
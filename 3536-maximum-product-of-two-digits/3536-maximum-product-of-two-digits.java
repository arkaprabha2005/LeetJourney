class Solution {
    public int maxProduct(int n) {
        //int product=1;
        int max=n%10;
        n=n/10;
        int max2=0;
        while(n!=0){
            if(n%10>max){
                max2=max;
                max=n%10;
                //n/=10;
            }
            else if(n%10<=max && n%10>=max2){
                max2=n%10;
                //n/=10;
            }
            n/=10;
        }
        return max2*max;
    }
}
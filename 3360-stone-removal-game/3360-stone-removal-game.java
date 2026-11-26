class Solution {
    public boolean canAliceWin(int n) {
        if(n<10) return false;
        if(n==10) return true;
        int x=10;
        Boolean choice=true;
        while(n>0){
            n-=x;
            if(n>=(--x)) choice=!choice ;
        }
        return choice;
    }
}
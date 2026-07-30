class Solution {
    public int minimumPushes(String word) {
        int key=0;
        int ans=word.length();
        if((ans/8)==0){
            key+=ans%8;
        }
        else if((ans/8)==1){
            key=8;
            //ans/=8;
            key+=(ans%8)*2;
        }
        else if((ans/8)==2){
            key=24;
            //ans/=16;
            key+=(ans%8)*3;
        }
        else{
            key=48;
            //ans/=24;
            key+=(ans%8)*4;
        }
        return key;
    }
}
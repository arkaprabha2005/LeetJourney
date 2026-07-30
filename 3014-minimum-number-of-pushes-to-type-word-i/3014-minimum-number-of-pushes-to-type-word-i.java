class Solution {
    public int minimumPushes(String word) {
        int key=0;
        int ans=word.length()/8;
        int i=1;
        while(i<=ans){
            key+=(8*i);
            i++;
        }
        key+=(word.length()%8)*i;
        return key;
    }
}
class Solution {
    public int minInsertions(String s) {
        int count=0;
        int store=0;
        char[] a=s.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]=='('){
                if (count % 2 != 0) {
                    store++;
                    count--;
                }
                count += 2;
            }
            else{
                count--;
                if(count<0){
                    store+=1;
                    count=1;
                }
            }
        }
        // if(count>=0) store+=count;
        // else {
        //     if(count==-2) store +=1;
        //     if(count==-1) store+=2;
        // }
        return store+count;
    }
}
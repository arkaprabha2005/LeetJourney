class Solution {
    public int numberOfSubstrings(String s) {
        int a=0;
        int b=0;
        int c=0;
        char[] arr=s.toCharArray();
        int l=0;
        int count=0;
        for(int i=0;i<s.length();i++){
            if(arr[i]=='a'){
                a++;
            }
            else if(arr[i]=='b'){
                b++;
            }
            else c++;

            while(a>=1 && b>=1 && c>=1 ){
                if(arr[l]=='a'){
                a--;
            }
            else if(arr[l]=='b'){
                b--;
            }
            else if (arr[l]=='c'){c--;}

                l++;
            }
            count+=l;
        
        }
        return count;
    }
}

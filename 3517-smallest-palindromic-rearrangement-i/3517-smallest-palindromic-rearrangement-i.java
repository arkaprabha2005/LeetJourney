class Solution {
    public String smallestPalindrome(String s) {
        int[] arr=new int[26];
        for(char a:s.toCharArray()){
            arr[a-'a']++;
        }

        char[] ans=new char[s.length()];
        int start=0;
        int end=s.length()-1;
        for(int i=0;i<arr.length;i++){
            while(arr[i]>0){
            if(arr[i]>=2){
                ans[start]=ans[end]=(char)('a'+i);
                start++;
                end--;
                arr[i]--;
                arr[i]--;
            }
            else if(arr[i]==1){
                ans[s.length()/2]=(char)('a'+i);
                arr[i]--;
            }
            }
            
            
        }
        return new String(ans);
    }
}


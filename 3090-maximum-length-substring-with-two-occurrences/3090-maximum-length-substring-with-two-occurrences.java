class Solution {
    public int maximumLengthSubstring(String s) {
        int length=0;
        char[] arr=s.toCharArray();
        int[] freq=new int[26];
        int start=0,end=0;
        for(int i=0;i<arr.length;i++){
            freq[arr[i]-'a']++;
            while(freq[arr[i]-'a']>2){
                freq[arr[start]-'a']--;
                start++;
            }
            end++;
            length=Math.max(length,end-start);
        }
        return length;
    }
}
class Solution {
    public int minimumPushes(String word) {
        //HashSet<Character> h1=new HashSet<>();
        int[] freq=new int[26];
        for(char ch:word.toCharArray()){
            freq[ch-'a']++;
        }
        Arrays.sort(freq);

        int ans=0;
        //int i=1;
        int count=0;
        for(int j=25;j>=0;j--){
            ans+=(freq[j]*((count/8)+1));
            count++;
        }
        return ans;
    }
}
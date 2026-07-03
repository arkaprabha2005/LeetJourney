class Solution {
    public int mostWordsFound(String[] sentences) {
        int words=0;
        for(String s:sentences){
            int t=0;
            for(char a:s.toCharArray()){
                if(a==' ') t++; 
            }
            words=Math.max(words,t);
        }
        return words+1;
    }

}
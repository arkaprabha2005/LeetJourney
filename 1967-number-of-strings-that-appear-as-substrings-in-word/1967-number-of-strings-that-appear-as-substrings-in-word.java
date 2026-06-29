class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int output=0;
        for(String s:patterns){
            if(word.contains(s)) output++;
        }
        return output;
    }
}
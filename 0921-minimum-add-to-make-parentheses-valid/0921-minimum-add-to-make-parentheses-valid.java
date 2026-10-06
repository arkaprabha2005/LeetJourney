class Solution {
    public int minAddToMakeValid(String s) {
        int score=0;
        int count=0;
        for(char a:s.toCharArray()){
            if(a==')') score--;
            else{
                if(score<0){
                    count+=(-score);
                    score=0;
                }
                score++;
            }   
        }
        if(score<0) count+=(-score);
        else count+=score;
        return count;
    }
}
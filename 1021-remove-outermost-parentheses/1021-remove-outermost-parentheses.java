class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb=new StringBuilder();
        int score=0;
        for(char a:s.toCharArray()){
            if(a==')')score--; 
            if(score!=0){
                sb.append(a);
            }
            if(a=='(') score++;
        }
        return sb.toString();
    }
}
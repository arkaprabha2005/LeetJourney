class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> s1=new Stack<>();
        s1.push(0);
        int c=0;
        
        for(char a:s.toCharArray()){
            if(a=='(') s1.push(0);
            else{
                int x=s1.pop();
                if(x==0){
                    x=1;
                }
                else{
                    x=x*2;
                }
                s1.push(s1.pop()+x);
            }
        }
        return s1.pop();
    }
}
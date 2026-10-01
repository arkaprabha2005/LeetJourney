class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1=new Stack<>();
        
        for(char a:s.toCharArray()){
            if(a=='(' || a=='{' || a=='[') s1.push(a);
            else{
                if(s1.isEmpty()) return false;
                if(a==')' && s1.peek()!='(') return false;
                if(a==']' && s1.peek()!='[') return false;
                if(a=='}' && s1.peek()!='{') return false;
                s1.pop();
            }

        }
        if(!s1.isEmpty()) return false;
        return true;
    }
}
class Solution {
    public String processStr(String s) {
        StringBuilder sb=new StringBuilder();
        for(char i:s.toCharArray()){
            if(i=='*' && sb.length()>0){
                sb.deleteCharAt(sb.length()-1);
            }
            else if(i=='*' && sb.length()<=0){
                continue;
            }
            else if(i=='#'){
                sb.append(sb);
            }
            else if(i=='%'){
                sb.reverse();
            }
            else{
                sb.append(i);
            }
        }
        return sb.toString();
    }
}
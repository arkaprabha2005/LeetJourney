class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char a:s.toCharArray()){
            if(((a-'a'>=0) && (a-'a')<26)||((a-'A'>=0) && (a-'A')<26)||(a>='0' && a<='9')){
                sb.append(Character.toLowerCase(a));
            }
        }
        for(int i=0;i<sb.length()/2;i++){
            if(sb.charAt(i) != sb.charAt(sb.length() - i - 1)) return false;
        }
        return true;
    }
}
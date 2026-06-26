class Solution {
    public String reversePrefix(String s, int k) {
        //String l=s.substring(0,k);
        StringBuilder sb=new StringBuilder(s.substring(0,k));
        sb.reverse();
        StringBuilder a=new StringBuilder(s);
        return a.replace(0,k,sb.toString()).toString();

    }
}
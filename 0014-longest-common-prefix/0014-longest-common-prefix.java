class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String st=strs[0];
        String ans="";
        String end=strs[strs.length-1];
        int i=0;
        while(i<st.length() && i<end.length() && st.charAt(i)==end.charAt(i)){
            i++;
        }
        return st.substring(0,i);
    }
}
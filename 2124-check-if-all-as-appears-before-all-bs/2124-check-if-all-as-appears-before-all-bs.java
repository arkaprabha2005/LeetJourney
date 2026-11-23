class Solution {
    public boolean checkString(String s) {
        char[] a=s.toCharArray();
        char prev=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<prev) return false;
            prev=a[i];
        }
        return true;
    }
}
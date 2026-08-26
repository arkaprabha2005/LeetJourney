class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int len=Integer.MAX_VALUE;
        int start=0;
        int count1=0;
        String res="";
        char[] arr=s.toCharArray();
        for(int end=0;end<s.length();end++){
            if(arr[end]=='1') count1++;
            while(count1==k){
                String sub=s.substring(start,end+1);
                if(res.equals("") || sub.length()<res.length() || (sub.length()==res.length()) && sub.compareTo(res)<0){
                    res=sub;
                }
                if(arr[start]=='1') count1--;
                start++;
            }

        }
        return res;
    }
}
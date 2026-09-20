class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            int x=arr[i]-'a';
            sum+=(i+1)*(26-x);
        }
        return sum;
    }
}
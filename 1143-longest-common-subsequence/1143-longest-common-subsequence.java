class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] arr=new int[text1.length()+1][text2.length()+1];
        //int[] curr=new int[text3.length()+1];
        char[] c1=text1.toCharArray();
        char[] c2=text2.toCharArray();
        
        

        for(int i=0;i<text1.length()+1;i++){
            for(int j=0;j<text2.length()+1;j++){
                if(i==0 || j==0){
                    arr[i][j]=0;
                }

                else if(c1[i-1]==c2[j-1]){
                    arr[i][j]=arr[i-1][j-1]+1;
                }
                else{
                    arr[i][j]=Math.max(arr[i-1][j],arr[i][j-1]);   
                }
            }
        }
        return arr[text1.length()][text2.length()];
    }
}
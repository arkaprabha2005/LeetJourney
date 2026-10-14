class Solution {
    public String maxSumOfSquares(int num, int sum) {
        
        if(sum>num*9) return "";
        
        StringBuilder output=new StringBuilder();
        int count=0;
        for(int i=0;i<num;i++){
            for(int j=9;j>=0;j--){
                count+=j;
                if(count<=sum){
                    output.append(j);
                    break;
                }
                count-=j;
            }
        }
        return output.toString();
    }
}
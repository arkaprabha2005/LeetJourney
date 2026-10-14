class Solution {
    public String maxSumOfSquares(int num, int sum) {
        
        if(sum>num*9) return "";
        StringBuilder output=new StringBuilder();
        
        // int count=0;
        // for(int i=0;i<num;i++){
        //     for(int j=9;j>=0;j--){
        //         count+=j;
        //         if(count<=sum){
        //             output.append(j);
        //             break;
        //         }
        //         count-=j;
        //     }
        // }
        int nines=sum/9;
        int r=sum%9;
        for(int i=0;i<nines;i++){
            output.append('9');
        }
        if(r>0) output.append(r);
        int zeros = num - output.length();
        for (int i = 0; i < zeros; i++) {
            output.append('0');
        }
        return output.toString();
    }
}
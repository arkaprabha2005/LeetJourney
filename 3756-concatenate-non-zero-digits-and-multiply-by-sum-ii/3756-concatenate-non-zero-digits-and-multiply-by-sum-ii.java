class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        int[] output=new int[queries.length];
        long[] prefix=new long[s.length()+1];
        long[] prefnum=new long[s.length()+1];
        int[] count=new int[s.length()+1];
        long[] pow10=new long[s.length()+1];
        long MOD=1000000007L;
        prefix[0]=0;
        prefnum[0]=0;
        count[0]=0;
        pow10[0]=1;
        int index=1;
        for(char c:s.toCharArray()){
            prefix[index]=prefix[index-1]+(c-'0');
            if(c!='0'){
                prefnum[index]=((prefnum[index-1]*10)+(c-'0'))%MOD;
                count[index]=count[index-1]+1;
                
            }
            else{
                prefnum[index]=prefnum[index-1];
                count[index]=count[index-1];
                //pow10[index]=pow10[index-1];
            }
            pow10[index]=(pow10[index-1]*10)%MOD;
            index++;
        }

        int ind=0;
        for(int[] q:queries){
            long sum = (prefix[q[1]+1]-prefix[q[0]]) % MOD;
            //long times=1;
            // for(int i=0;i<(count[q[1]+1] - count[q[0]]);i++){
            //     times=(times*10)%MOD;
            // }
            //long num=(prefnum[q[1]+1]-((times*prefnum[q[0]])%MOD)+MOD)%MOD;
            long num = (prefnum[q[1]+1] 
          - (prefnum[q[0]] * pow10[count[q[1]+1] - count[q[0]]]) % MOD
          + MOD) % MOD;
          output[ind++]=(int)((sum*num)%MOD);

        }
        return output;
    }
}
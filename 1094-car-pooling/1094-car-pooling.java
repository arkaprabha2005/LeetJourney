class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int[] arr=new int[1001];
        for(int[] i:trips){
            arr[i[1]]+=i[0];
            arr[i[2]]-=i[0];
        }
        //int max=Integer.MIN_VALUE;
        int sum=0;
        for(int i:arr){
            sum+=i;
            if(sum>capacity) return false;
        }
        return true;      
    }
}
class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> l1=new ArrayList<>();
        
        l1.add(new ArrayList<>(Arrays.asList(1)));
        if(numRows==1) return l1;

        l1.add(new ArrayList<>(Arrays.asList(1,1)));
        if(numRows==1)return l1;

        int j=1;

        for(int i=2;i<numRows;i++){
            l1.add(new ArrayList<>());
            l1.get(i).add(1);
            for(int k=0;k<j;k++){
                int sum=l1.get(i-1).get(k)+l1.get(i-1).get(k+1);
                l1.get(i).add(sum);
            }
            l1.get(i).add(1);
            j++;
        }
        return l1;
    }
}
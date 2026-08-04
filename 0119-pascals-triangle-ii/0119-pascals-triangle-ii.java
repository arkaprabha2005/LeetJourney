class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> l1=new ArrayList<>();
        long num=1;
        for(int i=0;i<rowIndex;i++){
            l1.add((int)num);
            num=num*(rowIndex-i)/(i+1);
        }   
        l1.add((int)num);
        return l1;
    }
}
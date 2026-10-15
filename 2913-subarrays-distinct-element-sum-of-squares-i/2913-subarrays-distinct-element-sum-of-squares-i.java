class Solution {
    public int sumCounts(List<Integer> nums) {
        int count=0;
        HashSet<Integer> h1=new HashSet<>(); 
        for(int i=0; i<nums.size();i++){
            int dist=0;
            for(int j=i;j<nums.size();j++){
                if(!h1.contains(nums.get(j))){
                    dist++;
                    h1.add(nums.get(j));
                }
                count+=(dist*dist);
            }
            h1.clear();
        }
        return count;
    }
}
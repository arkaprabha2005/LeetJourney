class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int n:nums){
            min=Math.min(min,n);
            max=Math.max(max,n);
        }
        List<Integer> l1=new ArrayList<>();
        HashSet<Integer> h1=new HashSet<>();
        for(int n:nums){
            h1.add(n);
        }
        for(int i=min+1;i<max;i++){
            if(!h1.contains(i)) l1.add(i);
        }

        return l1;
    }
}
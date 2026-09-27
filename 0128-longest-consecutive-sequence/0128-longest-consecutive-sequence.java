class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> h1=new HashSet<>();
        if(nums.length==0) return 0;
        //int last=Integer.MIN_VALUE;
        for(int i:nums){
            h1.add(i);
           //last=Math.max(last,i);
        }
        int max=Integer.MIN_VALUE;
        for(int i:h1){
            int counter=0;
            int z=i;
            if(!h1.contains(z-1)){
                while(h1.contains(z++)){
                    counter++;
                }
                max=Math.max(max,counter);
            }
            
        }
        return max;
    }
}
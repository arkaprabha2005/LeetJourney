class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        int max=0;
        int start=0;
        for(int end=0;end<nums.length;end++){
            h1.put(nums[end],h1.getOrDefault(nums[end],0)+1);
            while(h1.getOrDefault(nums[end],0)>k){
                h1.put(nums[start],h1.getOrDefault(nums[start],0)-1);
                start++;
            }
            max=Math.max(end-start+1,max);
        }
        return max;
    }
}
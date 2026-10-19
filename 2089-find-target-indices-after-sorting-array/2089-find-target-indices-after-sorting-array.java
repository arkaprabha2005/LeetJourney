class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> l1=new ArrayList<>();
        int count=0;
        int t=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target) count++;
            if(nums[i]==target) t++;
        }
        for(int i=0;i<t;i++){
            l1.add(i+count);
        }
        return l1;
    }
}
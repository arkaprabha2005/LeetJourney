class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> l1=new ArrayList<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target) count++;
            if(nums[i]==target) l1.add(i);
        }
        for(int i=0;i<l1.size();i++){
            l1.set(i,i+count);
        }
        return l1;
    }
}
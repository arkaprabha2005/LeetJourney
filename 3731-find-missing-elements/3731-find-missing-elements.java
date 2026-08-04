class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> l1=new ArrayList<>();
        HashSet<Integer> h1=new HashSet<>();
        for(int n:nums){
            h1.add(n);
        }
        for(int i=nums[0]+1;i<nums[nums.length-1];i++){
            if(!h1.contains(i)) l1.add(i);
        }

        return l1;
    }
}
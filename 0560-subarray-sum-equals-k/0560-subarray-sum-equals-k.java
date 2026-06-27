class Solution {
    public int subarraySum(int[] nums, int k) {
        int[] prefix=new int[nums.length+1];
        prefix[0]=0;

        for(int i=0;i<nums.length;i++){
            prefix[i+1]=prefix[i]+nums[i];
        }

        int count=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<prefix.length;i++){
            if(map.containsKey(prefix[i]-k)){
                count+=map.get(prefix[i]-k);
            }
            map.put(prefix[i],map.getOrDefault(prefix[i],0)+1);
        }
        return count;
    }
}
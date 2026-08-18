class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer> h1=new HashMap<>();
        int ans=-1;
        for(int i:nums){
            h1.put(i,h1.getOrDefault(i,0)+1);
        }
        if(k==1){
            if(k==2) return Math.max(nums[0],nums[nums.length-1]); 
            for(int i:nums){
                if(h1.get(i)==1 && i>ans){
                    ans=i;
                }
            }
            return ans;
        }

        if(k==nums.length){ 
            for(int i:nums){
                if(i>ans){
                    ans=i;
                }
            }
            return ans;
        }

        
        if(k>1){
            if(h1.get(nums[0])==1 && h1.get(nums[nums.length-1])==1){
                return Math.max(nums[0],nums[nums.length-1]);
            }
            if(h1.get(nums[0])>1 && h1.get(nums[nums.length-1])==1){
                return nums[nums.length-1];
            }
            if(h1.get(nums[0])==1 && h1.get(nums[nums.length-1])>1){
                return nums[0];
            }
            return -1;
        }
        
        return ans;
    }
}
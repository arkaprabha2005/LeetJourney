class Solution {
    public int findMaxLength(int[] nums) {
        int length=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        //int count=0;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                sum++;
                
            }
            else{
                sum--;
                
            }
            if(!map.containsKey(sum)){
                    map.put(sum,i);
                }
            else{
                length=Math.max(length,i-map.get(sum));
            }
        }
        return length;

    }
}
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }//stored

        List<Integer>[] l1=new ArrayList[nums.length+1];

        for(int i:map.keySet()){
            int freq=map.get(i);
            if(l1[freq]==null){
                l1[freq]=new ArrayList<>();
            }

            l1[freq].add(i);
        }

        int[] output=new int[k];
        int p=0;
        for(int i=nums.length;i>0;i--){
            if(l1[i]!=null && k>0){
                for(int ko:l1[i]){
                    output[p++]=ko;
                    k--;
                }
            }
        }
        return output;

    }
}
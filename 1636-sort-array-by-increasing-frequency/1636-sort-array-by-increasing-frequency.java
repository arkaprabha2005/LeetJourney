class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        List<Integer>[] l1=new ArrayList[nums.length+1];
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }//counting freq

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(l1[entry.getValue()]==null){
                l1[entry.getValue()]=new ArrayList<>();
            }
            l1[entry.getValue()].add(entry.getKey());
        }

        int [] output=new int[nums.length];
        int index=0;
        for(int i=0;i<nums.length+1;i++){
            if(l1[i]!=null){
                Collections.sort(l1[i],Collections.reverseOrder());
                for(int k:l1[i]){
                    for(int j=0;j<i;j++){
                        output[index++]=k;
                    }
                }
            }
            
            
        }

        return output;
    }
}
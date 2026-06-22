class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int[] arr=new int[nums.length];
        for(int i:nums){
            arr[i-1]++;
        }

        List<Integer> l1=new ArrayList<>();
        for(int k=0;k<arr.length;k++){
            if(arr[k]==2){
                l1.add(k+1);
            }
        }
        return l1;
    }
}
class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> h1=new HashSet<>();
        HashSet<Integer> h2=new HashSet<>();

        int ans1=0,ans2=0;
        for(int i:nums1){
            h1.add(i);
        }

        for(int i:nums2){
            h2.add(i);
        }

        for(int i:nums1){
            if(h2.contains(i)){
                ans1++;
            }
        }

        for(int i:nums2){
            if(h1.contains(i)){
                ans2++;
            }
        }

        int[] arr={ans1,ans2};
        return arr;
    }
}
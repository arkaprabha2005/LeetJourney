class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        int found=1;
        return nums[nums.length-k];

    }
}
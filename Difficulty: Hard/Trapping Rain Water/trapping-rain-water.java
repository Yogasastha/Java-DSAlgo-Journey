class Solution {
    public int maxWater(int nums[]) {
        int n = nums.length;
        int leftMax = nums[0];
        int[] suffix = suffix(nums);
        int rightMax = 0;
        int stored = 0;
        for(int i = 1; i < n- 1; i++) {
            if(nums[i] > leftMax) leftMax = nums[i];
            rightMax = suffix[i+1];
            if(nums[i] < leftMax && nums[i] < rightMax) {
                stored += Math.min(leftMax, rightMax) - nums[i]; 
            }
        }
        return stored;
    }
    public int[] suffix(int[] nums) {
        int n = nums.length;
        int[] suffix = new int[n];
        suffix[n-1] = nums[n-1];
        for(int i = n -2; i >= 0; i--) {
            if(suffix[i+1] < nums[i]) {
                suffix[i] = nums[i];
            } else {
                suffix[i] = suffix[i+1];
            }
        }
        return suffix;
    }
}

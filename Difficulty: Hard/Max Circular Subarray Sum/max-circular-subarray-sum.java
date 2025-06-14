class Solution {
    public int circularSubarraySum(int nums[]) {
        // code here
        int total = 0;
        int curMax = 0, maxSum = nums[0];
        int curMin = 0, minSum = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            total += num;
            
            curMax = Math.max(num, curMax + num);
            maxSum = Math.max(maxSum, curMax);
            
            curMin = Math.min(num, curMin + num);
            minSum = Math.min(minSum, curMin);
        }
        
        if (maxSum < 0) return maxSum;

        return Math.max(maxSum, total - minSum);
    }
}

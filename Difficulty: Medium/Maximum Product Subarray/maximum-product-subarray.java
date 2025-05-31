class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] nums) {
         int n = nums.length;
        int max = Integer.MIN_VALUE;
        int pre = 1;
        int suf = 1;
        for(int i = 0; i < n; i++) {
            if(suf == 0) suf = 1;
            if(pre == 0) pre = 1;
            pre = nums[i] * pre;
            suf = nums[n - 1 - i] * suf;
            int maxz = Math.max(pre, suf);
            max = Math.max(maxz, max);
        }
        return max;
    }
}

class Solution {
    public static int longestSubseq(int[] arr) {
           int n = arr.length;
        int[] dp = new int[n];
        int maxLen = 1;

        // Every element can at least form a subsequence of length 1
        for (int i = 0; i < n; i++) {
            dp[i] = 1;
        }

        // DP: check all previous elements
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (Math.abs(arr[i] - arr[j]) == 1) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }

        return maxLen;
    }
}

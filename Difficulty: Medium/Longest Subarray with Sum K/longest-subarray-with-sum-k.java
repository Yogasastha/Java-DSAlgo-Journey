// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
         Map<Integer, Integer> prefixSumMap = new HashMap<>();
        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == k) {
                maxLength = i + 1;
            }

            if (prefixSumMap.containsKey(sum - k)) {
                int length = i - prefixSumMap.get(sum - k);
                maxLength = Math.max(maxLength, length);
            }


            if (!prefixSumMap.containsKey(sum)) {
                prefixSumMap.put(sum, i);
            }
        }

        return maxLength;
    }
}

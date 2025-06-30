class Solution {
    public int maxMinHeight(int[] arr, int k, int w) {
         int n = arr.length;
        int low = Integer.MAX_VALUE;
        int high = 0;

        for (int height : arr) {
            low = Math.min(low, height);
            high = Math.max(high, height);
        }
        high += k;

        int result = low;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (canAchieve(arr, mid, k, w)) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }

    private static boolean canAchieve(int[] arr, int minHeight, int k, int w) {
        int n = arr.length;
        int[] water = new int[n + 1];
        long used = 0;
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += water[i];
            int currentHeight = arr[i] + (int) sum;

            if (currentHeight < minHeight) {
                int diff = minHeight - currentHeight;
                used += diff;
                if (used > k) return false;

                sum += diff;
                if (i + w < water.length) {
                    water[i + w] -= diff;
                }
            }
        }
        return true;
}
}
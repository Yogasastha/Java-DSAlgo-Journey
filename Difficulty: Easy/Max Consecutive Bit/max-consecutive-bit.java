class Solution {
    public int maxConsecBits(int[] arr) {
         if (arr.length == 0) return 0;

        int maxCount = 1;
        int count = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}

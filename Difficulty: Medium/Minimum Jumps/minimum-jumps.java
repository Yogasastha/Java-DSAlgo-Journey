class Solution {
    static int minJumps(int[] arr) {
        // code here
         int n = arr.length;

        if (n <= 1)
            return 0;

        if (arr[0] == 0)
            return -1;

        int jumps = 1;
        int farthest = arr[0];
        int currentEnd = arr[0];

        for (int i = 1; i < n; i++) {
            if (i == n - 1)
                return jumps;

            farthest = Math.max(farthest, i + arr[i]);

            if (i == currentEnd) {
                jumps++;
                currentEnd = farthest;

                if (currentEnd <= i)
                    return -1;
            }
        }

        return -1;
    }
}
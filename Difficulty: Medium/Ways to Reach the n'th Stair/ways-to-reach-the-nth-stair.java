class Solution {
    int countWays(int n) {
        if(n <= 0) return 0;
        if(n == 1) return 1;
        int f = 1;
        int s = 1;
        for(int i = 2; i <= n; i++) {
            int cur = f + s;
            f = s;
            s = cur;
        }
        return s;
    }
}

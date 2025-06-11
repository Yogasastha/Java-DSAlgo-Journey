class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int max = Integer.MIN_VALUE;
        int ls = 0;
        int rs = 0;
        int n = cardPoints.length;
        for(int i = 0; i < k ; i++) {
            ls += cardPoints[i];
        }
        max = ls;
        for(int i = 0; i < k; i++) {
            rs += cardPoints[n - 1 - i];
            ls -= cardPoints[k - 1 - i];
            int cSum = ls + rs;
            max = Math.max(max, cSum);
        }
        return max;
    }
}

// User function Template for Java

class Solution {
    int totalCount(int k, int[] arr) {
              int sum = 0;
        for(int num: arr) {
                int count = num / k;
                num %= k;
                sum += count + ((num > 0) ? 1: 0);
                num /=k;
        }
        return sum;
    }
}

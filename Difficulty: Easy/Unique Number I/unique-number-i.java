class Solution {
    public int findUnique(int[] arr) {
        int res = 0;
        for(int num: arr) {
            res ^= num;
        }
        return res;
    }
}
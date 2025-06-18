class Solution {
    int missingNum(int nums[]) {
        
        int n = nums.length + 1;
        long sum =(long) n * (n + 1)/2;
        long total = 0;
        for(int num: nums) {
            total += num;
        }
        return (int) (sum - total);
    }
}
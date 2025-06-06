// User function Template for Java

class Solution {
    void pushZerosToEnd(int[] nums) {
        // code here
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                swap(nums, i, count);
                count++;
            }
        }
    }
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j]= temp;
    }
}
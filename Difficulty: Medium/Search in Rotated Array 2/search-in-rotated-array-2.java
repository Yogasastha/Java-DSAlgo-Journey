class Solution {
    public static boolean Search(int[] nums, int target) {
          int s = 0;
         int e = nums.length-1;
         while(s<= e) {
            int m = s + (e - s)/2;
            if(nums[m] == target) return true;
            if(nums[s] == nums[m] && nums[e] == nums[m]) {
                s++;
                e--;
            } else if(nums[m] >= nums[s]) {
                if(nums[s] <= target && target < nums[m]) {
                    e = m -1;
                } else {
                    s = m + 1;
                }
            } else {
                if(nums[e] >= target && target > nums[m]) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            }
         }
         return false;
    }
}

// User function Template for Java

class GFG {
    ArrayList<Integer> find(int nums[], int target) {
        int s = 0;
        int e = nums.length - 1;
        int first = firstLastPosition(nums, target, s, e, true);
        int last = firstLastPosition(nums, target, s, e, false);
        return  new ArrayList<>(
            Arrays.asList(first, last));
    }
    public int firstLastPosition(int[] nums, int target, int s, int e, boolean isFirst) {
        int start = -1;
        while(s <= e) {
            int m = s + ( e - s) / 2;
            if(nums[m] == target) {
                start = m;
                if(isFirst) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }else if(nums[m] > target) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return start;
    }
}
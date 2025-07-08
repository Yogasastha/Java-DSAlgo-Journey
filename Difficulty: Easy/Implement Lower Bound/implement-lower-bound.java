class Solution {
    int lowerBound(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;
        int ans = arr.length;
        
        while(s <= e) {
            int m = s + (e-s) / 2;
            if(arr[m] >= target) {
                ans = m;
                e = m -1;
            } else {
                s = m + 1;
            }
        }
        return ans;
    }
}

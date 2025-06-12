// User function Template for Java

class Solution {
    public int findMin(int[] arr) {
        int s = 0;
        int e = arr.length-1;
        
        while(s < e) {
            int m = s + (e - s) / 2;
            if(arr[e] > arr[s]) return arr[s];
            if(arr[e] < arr[m])  {
                s = m + 1;
            } else {
                e = m;
            }
        }
        return arr[s];
    }
}

/*Complete the function below*/

class Solution {
    // Function to find triplets with zero sum.
    public boolean findTriplets(int[] arr) {
        
        Arrays.sort(arr);
        
        int n = arr.length;
        for(int i = 0; i < n; i++) {
            int s = i + 1;
            int e = n - 1;
            while(s < e) {
                int sum = arr[i] + arr[s] + arr[e];
                if(sum == 0) {
                    return true;
                }
                if(sum < 0) {
                    s++;
                } else {
                    e--;
                }
            }
        }
        return false;
    }
}
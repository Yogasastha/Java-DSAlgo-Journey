class Solution {
    public boolean isPerfect(int[] arr) {
         
        if (arr.length < 1) return true;
         
        int i = 0;
        int n = arr.length;
        
        while(i+1 < n && arr[i] < arr[i+1]) i++;
        while(i+1 < n && arr[i] == arr[i+1]) i++;
        while(i+1 < n && arr[i] > arr[i+1]) i++;
        
        return i == n-1;
    }
}

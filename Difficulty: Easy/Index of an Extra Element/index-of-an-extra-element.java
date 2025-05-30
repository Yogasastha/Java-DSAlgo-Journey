/*Complete the function below*/
class Solution {
    public int findExtra(int arr1[], int arr2[]) {
        // add code here.
        int left = 0, right = arr2.length;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (arr1[mid] == arr2[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
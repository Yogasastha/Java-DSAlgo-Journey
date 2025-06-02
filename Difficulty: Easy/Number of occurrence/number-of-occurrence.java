class Solution {
    int countFreq(int[] arr, int target) {
      int first = findFirstOccurrence(arr, target, true);
        if (first == -1) return 0; // Target not found
        int last = findFirstOccurrence(arr, target, false);
        return last - first + 1;
    }

    int findFirstOccurrence(int[] arr, int target, boolean isFirst) {
        int low = 0, high = arr.length - 1, result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == target) {
                result = mid;
                if(isFirst) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

}

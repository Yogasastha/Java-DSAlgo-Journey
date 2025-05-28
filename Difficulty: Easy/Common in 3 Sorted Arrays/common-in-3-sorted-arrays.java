// User function Template for Java

class Solution {
    // Function to find common elements in three arrays.
    public List<Integer> commonElements(List<Integer> arr1, List<Integer> arr2,
                                        List<Integer> arr3) {
                                             int i = 0, j = 0, k = 0;
        List<Integer> result = new ArrayList<>();
        int lastPrinted = Integer.MIN_VALUE;

        while (i < arr1.size() && j < arr2.size() && k < arr3.size()) {
            int a = arr1.get(i);
            int b = arr2.get(j);
            int c = arr3.get(k);

            if (a == b && b == c) {
                if (a != lastPrinted) {
                    result.add(a);
                    lastPrinted = a;
                }
                // Skip duplicates
                while (i < arr1.size() && arr1.get(i) == a) i++;
                while (j < arr2.size() && arr2.get(j) == b) j++;
                while (k < arr3.size() && arr3.get(k) == c) k++;
            } else {
                int min = Math.min(a, Math.min(b, c));

                // Skip the smallest
                if (a == min) {
                    while (i < arr1.size() && arr1.get(i) == a) i++;
                }
                if (b == min) {
                    while (j < arr2.size() && arr2.get(j) == b) j++;
                }
                if (c == min) {
                    while (k < arr3.size() && arr3.get(k) == c) k++;
                }
            }
        }

        if (result.isEmpty()) {
            result.add(-1);
        }

        return result;
    }
}
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
          ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        int maxRight = arr[n - 1];


        result.add(maxRight);


        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                result.add(arr[i]);
                maxRight = arr[i];
            }
        }


        Collections.reverse(result);
        return result;
    }
}

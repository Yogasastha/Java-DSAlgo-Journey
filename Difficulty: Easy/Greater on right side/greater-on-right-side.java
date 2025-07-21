// User function Template for Java
class Solution {
    static ArrayList<Integer> nextGreatest(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;
        int maxFromRight = -1;
        
        for (int i = n - 1; i >= 0; i--) {
            int current = arr[i];
            result.add(0, maxFromRight);
            if (current > maxFromRight) {
                maxFromRight = current;
            }
        }

        return result;
    }
}
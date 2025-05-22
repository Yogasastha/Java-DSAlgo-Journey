// User function Template for Java

class Solution {
    ArrayList<Integer> findMissing(int[] a, int[] b) {
        // Day 01
        Set<Integer> setB = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();

        
        for (int num : b) {
            setB.add(num);
        }

        
        for (int num : a) {
            if (!setB.contains(num)) {
                result.add(num);
            }
        }

        return result;
    }
}

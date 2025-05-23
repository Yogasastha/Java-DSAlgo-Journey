    // User function Template for Java
    
    class Solution {
        public int maxChars(String S) {
            int[] firstIndex = new int[256];
        Arrays.fill(firstIndex, -1);
        int maxDistance = -1;

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (firstIndex[ch] == -1) {
                firstIndex[ch] = i;
            } else {
                int distance = i - firstIndex[ch] - 1;
                maxDistance = Math.max(maxDistance, distance);
            }
        }

        return maxDistance;
        }
    }
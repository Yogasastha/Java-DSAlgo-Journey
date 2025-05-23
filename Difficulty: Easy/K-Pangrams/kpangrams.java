// User function Template for Java
class Solution {
    boolean kPangram(String str, int k) {
        int[] alpha = new int[26];
        int total = 0;
        for(char ch: str.toLowerCase().toCharArray()) {
            if(ch >= 'a' && ch <= 'z') {
                alpha[ch - 'a']++;
                total++;
            }
        }
        int missing = 0;
        for(int val: alpha) {
            if(val < 1) {
                missing++;
            }
        }
        return missing <= k && total >= 26;
    }
}
// User function Template for Java

class Solution {
    public int longestUniqueSubstr(String s) {
        
        int n = s.length();
        
        Set<Character> set = new HashSet<>();
        
        int f = 0;
        int ss = 0;
        int max = 0;
        while(ss < n) {
            if(!set.contains(s.charAt(ss))) {
                set.add(s.charAt(ss));
                ss++;
                max = Math.max(max, ss-f);
            } else {
                set.remove(s.charAt(f));
                f++;
            }
        }
        return max;
    }
}
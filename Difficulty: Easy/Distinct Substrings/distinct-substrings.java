// User function Template for Java
class Solution {
    int fun(String s) {
          HashSet<String> substrings = new HashSet<>();
        
        for (int i = 0; i < s.length() - 1; i++) {
            substrings.add(s.substring(i, i + 2));
        }
        
        return substrings.size();
    }
}
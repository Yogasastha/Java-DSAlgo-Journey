class Solution {
     public static String reverseWords(String s) {
        
        String[] parts = s.split("\\.");
        
        int n = parts.length;
        
        StringBuilder sb = new StringBuilder();
        
        
        for (int j = n - 1; j >= 0; j--) {
        
            if (!parts[j].isEmpty()) {
                if (sb.length() > 0) {
                    sb.append(".");
                }
                sb.append(parts[j]);
            }
        }
        
        return sb.toString();
    }
}

class Solution {
    public String reverseWords(String s) {
         char[] chars = s.toCharArray();
        int n = chars.length;
        StringBuilder result = new StringBuilder();

        int i = 0;
        while (i < n) {
            
            while (i < n && chars[i] == ' ') {
                i++;
            }

            
            int start = i;

            
            while (i < n && chars[i] != ' ') {
                i++;
            }

            int end = i - 1;

            
            for (int j = end; j >= start; j--) {
                result.append(chars[j]);
            }

            
            while (i < n && chars[i] == ' ') {
                i++;
            }

            if (i < n && result.length() > 0) {
                result.append(' ');
            }
        }

        return result.toString();
    }
}

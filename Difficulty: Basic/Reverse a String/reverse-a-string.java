// User function Template for Java

class Solution {
    public static String reverseString(String s) {
          // Convert the string to a character array
        char[] chars = s.toCharArray();

        // Initialize two pointers
        int left = 0, right = chars.length - 1;

        // Swap characters from both ends
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        // Return the reversed string
        return new String(chars);
    }
}
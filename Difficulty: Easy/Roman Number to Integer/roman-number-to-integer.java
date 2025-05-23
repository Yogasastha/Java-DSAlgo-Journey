// User function Template for Java

class Solution {
    // Finds decimal value of a given roman numeral
    public int romanToDecimal(String s) {
        // code here
        Map<Character, Integer> map =  Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50, 
            'C', 100,
            'D', 500,
            'M', 1000
            );
            
            int res = 0;
            
             for (int i = 0; i < s.length(); i++) {
                int currentVal = map.get(s.charAt(i));

            if (i < s.length() - 1 && currentVal < map.get(s.charAt(i + 1))) {
                res -= currentVal;
            } else {
                res += currentVal;
            }
        }
        return res;
    }
}
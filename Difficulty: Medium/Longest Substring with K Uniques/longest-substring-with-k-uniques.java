class Solution {
     public static int longestKSubstr(String s, int k) {
        int i = 0;
        int j = 0;
        int n = s.length();
        int maxLen = -1;
        Map<Character, Integer> map = new HashMap<>();
        
        while(j < n) {
            char ch = s.charAt(j); 
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            while(map.size() > k){
                char chr = s.charAt(i);
                map.put(chr, map.get(chr)-1);
                if(map.get(chr) == 0) map.remove(chr); 
                i++;
            }
            if (map.size() == k) {
                maxLen = Math.max(maxLen, j - i + 1);
            }            
          j++; 
        }
        return maxLen;
    }
}
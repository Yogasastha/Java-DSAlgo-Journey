// User function Template for Java

class Solution {
    public String reverse(String str) {
        
        char[] ch = str.toCharArray();
        
        int i = 0; 
        int j = ch.length-1;
        
        while(i < j) {
            if(!Character.isLetter(ch[i])) {
                i++;
            } else if(!Character.isLetter(ch[j])) {
                j--;
            } else {
                swap(ch, i, j);
                i++;
                j--;
            }
        }
        return new String(ch);
        }
    public static void swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }
}
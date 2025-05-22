// User function Template for Java

class Solution {

    public void sortIt(Long arr[]) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0) {
                arr[i] *= -1;
            }
        }
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                break;
            }
            arr[i] *= -1;
        }
    }
}
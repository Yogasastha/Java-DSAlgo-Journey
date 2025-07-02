class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n];

        for (int num : arr) {
            if (num >= 1 && num <= n) {
                freq[num - 1]++;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int count : freq) {
            result.add(count);
        }

        return result;
    }
}

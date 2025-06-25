class Solution {
    public static void print_divisors(int n) {
        Set<Integer> divisor = new TreeSet<>();
        for(int i = 1; i * i <= n; i++) {
            if(n % i == 0) {
                divisor.add(i);
                divisor.add(n / i);
            }
        }
        for(int val: divisor) {
            System.out.print(val + " ");
        }
    }
}

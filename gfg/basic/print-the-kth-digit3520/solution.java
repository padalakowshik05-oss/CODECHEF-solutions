class Solution {
    static long kthDigit(int a, int b, int k) {
        long p = (long) Math.pow(a, b);
        long d = 0;

        for (int i = 0; i < k; i++) {
            d = p % 10;
            p /= 10;
        }

        return d;
        
    }
}
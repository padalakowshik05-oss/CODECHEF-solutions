class Solution {
    public long nPr(int n, int r) {
        long result = 1;

        for (long i = 0; i < r; i++) {
            result *= (n - i);
        }

        return result;
        
    }
}
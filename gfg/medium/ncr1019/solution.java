class Solution {
    public int nCr(int n, int r) {
        if (r > n) {
            return 0;
        }

        r = Math.min(r, n - r);

        long res = 1;

        for (int i = 0; i < r; i++) {
            res = res * (n - i) / (i + 1);
        }

        return (int) res;
    }
}

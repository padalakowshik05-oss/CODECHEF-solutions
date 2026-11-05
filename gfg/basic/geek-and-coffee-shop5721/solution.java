class Solution {
    public int mthHalf(int n, int m) {
        return n / (int)Math.pow(2, m - 1);
    }
}
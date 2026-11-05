class Solution {
    static int calculateFutureValue(int p, int t, int n, int r) {
        return (int) (p * Math.pow(1 + (double) r / (100 * n), n * t));
    }
}
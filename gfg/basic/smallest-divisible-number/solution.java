class Solution {
    public static long getSmallestDivNum(int n) {
        long ans = 1;

        for (int i = 2; i <= n; i++) {
            ans = (ans * i) / gcd(ans, i);
        }

        return ans;
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
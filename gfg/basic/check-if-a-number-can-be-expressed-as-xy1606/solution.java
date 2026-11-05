class Solution {
    public boolean checkPower(int n) {
        if (n == 1) return true;
        if (n <= 0) return false;

        for (int x = 2; (long) x * x <= n; x++) {
            long val = (long) x * x;

            while (val <= n) {
                if (val == n) return true;
                val *= x;
            }
        }

        return false;
    }
}
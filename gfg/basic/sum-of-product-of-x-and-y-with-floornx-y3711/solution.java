class Solution {
    public int sumofproduct(int n) {
        int sum = 0;

        for (int x = 1; x <= n; x++) {
            sum += x * (n / x);
        }

        return sum;
    }
}
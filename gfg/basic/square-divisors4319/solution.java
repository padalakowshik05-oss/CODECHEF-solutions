class Solution {
    public int squareFactor(int n) {
        int count = 1;

        for (int i = 2; i * i <= n; i++) {
            int power = 0;

            while (n % i == 0) {
                power++;
                n /= i;
            }

            count *= (power / 2 + 1);
        }

        return count;
    }
}
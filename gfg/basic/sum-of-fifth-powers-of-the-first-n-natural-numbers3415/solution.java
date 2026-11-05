class Solution {
    public int sumOfFifthPowers(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (int) Math.pow(i, 5);
        }

        return sum;
    }
}
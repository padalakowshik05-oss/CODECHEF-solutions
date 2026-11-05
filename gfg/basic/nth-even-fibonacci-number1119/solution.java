class Solution {
    static int nthEvenFibonacci(int n) {
        if (n == 1) return 2;
        if (n == 2) return 8;

        int prev = 2;
        int curr = 8;

        for (int i = 3; i <= n; i++) {
            int next = 4 * curr + prev;

            prev = curr;
            curr = next;
        }

        return curr;
    }
}
class Solution {
    static int isSumPalindrome(int n) {
        if (n == reverse(n)) {
            return n;
        }
        for (int i = 0; i < 5; i++) {
            n = n + reverse(n);

            if (n == reverse(n)) {
                return n;
            }
        }

        return -1;
    }

    static int reverse(int n) {
        int rev = 0;

        while (n > 0) {
            int d = n % 10;
            rev = rev * 10 + d;
            n /= 10;
        }

        return rev;
    }
}
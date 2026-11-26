class Solution {

   
    static long primorial(int n) {
        int ans = 1;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                ans *= i;
            }
        }
        return ans;
    }

    static boolean isPrime(int num) {
        if (num < 2)
            return false;

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }

        return true;
    }
}
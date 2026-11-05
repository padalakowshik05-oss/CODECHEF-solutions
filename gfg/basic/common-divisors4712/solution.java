class Solution {
    int commDiv(int a, int b) {
        int gcd = a;

        while (b != 0) {
            int temp = b;
            b = gcd % b;
            gcd = temp;
        }

        int count = 0;

        for (int i = 1; i * i <= gcd; i++) {
            if (gcd % i == 0) {
                count += (i * i == gcd) ? 1 : 2;
            }
        }

        return count;
    }
}
class Solution {
    public int minNumber(int a, int b, int c, int n) {
         long l = lcm(a, b);
        l = lcm(l, c);

        long start = 1;
        for (int i = 1; i < n; i++)
            start *= 10;

        long end = start * 10 - 1;

        long ans = ((start + l - 1) / l) * l;

        if (ans > end)
            return -1;

        return (int) ans;
    }

    long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
}
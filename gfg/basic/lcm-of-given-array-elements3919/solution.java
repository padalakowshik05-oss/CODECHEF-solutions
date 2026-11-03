class Solution {
    public int lcmOfArray(int[] a) {
        int lcm = 1;

        for (int x : a) {
            lcm = (lcm * x) / gcd(lcm, x);
        }

        return lcm;
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}
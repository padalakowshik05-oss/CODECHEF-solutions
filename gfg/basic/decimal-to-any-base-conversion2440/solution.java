class Solution {
    public String decimalToBase(int b, int n) {
        if (n == 0) return "0";

        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            int rem = n % b;

            if (rem < 10) {
                sb.append(rem);
            } else {
                sb.append((char) ('A' + rem - 10));
            }

            n /= b;
        }

        return sb.reverse().toString();
    }
}
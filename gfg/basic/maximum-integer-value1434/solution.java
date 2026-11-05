class Solution {
    public int maximumIntegerValue(String s) {
        int ans = s.charAt(0) - '0';

        for (int i = 1; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';

            if (ans <= 1 || digit <= 1) {
                ans += digit;
            } else {
                ans *= digit;
            }
        }

        return ans;
    }
}
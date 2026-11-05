class Solution {
    public boolean isTidy(int n) {
        String s = String.valueOf(n);

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                return false;
            }
        }

        return true;
    }
}
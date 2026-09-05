class Solution {
    public static String encode(String s) {
        StringBuilder ans = new StringBuilder();

        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (i + 1 < s.length() && c == s.charAt(i + 1)) {
                count++;
            } else {
                ans.append(c);
                ans.append(count);
                count = 1;
            }
        }

        return ans.toString();
    }
}
class Solution {
    static String encryptString(String S) {
        StringBuilder ans = new StringBuilder();

        int i = S.length() - 1;

        while (i >= 0) {
            char c = S.charAt(i);
            int count = 0;

            while (i >= 0 && S.charAt(i) == c) {
                count++;
                i--;
            }

            ans.append(Integer.toHexString(count));
            ans.append(c);
        }

        return ans.toString();
    }
};
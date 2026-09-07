class Solution {
    public boolean nonRepetitive(String s) {
        boolean[] seen = new boolean[26];

        char prev = '\0';

        for (char ch : s.toCharArray()) {

            if (ch != prev) {
                if (seen[ch - 'A']) {
                    return false;
                }

                seen[ch - 'A'] = true;
                prev = ch;
            }
        }

        return true;
    }
}
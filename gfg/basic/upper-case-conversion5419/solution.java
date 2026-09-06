class Solution {
    public String convert(String s) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (i == 0 || s.charAt(i - 1) == ' ') {
                ans.append(Character.toUpperCase(ch));
            } else {
                ans.append(ch);
            }
        }

        return ans.toString();
    }
}
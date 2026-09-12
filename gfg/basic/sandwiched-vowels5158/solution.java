class Solution {
    public String sandwichedVowel(String s) {
        StringBuilder ans = new StringBuilder();

                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);

                    if (i > 0 && i < s.length() - 1 &&
                        isVowel(c) &&
                        !isVowel(s.charAt(i - 1)) &&
                        !isVowel(s.charAt(i + 1))) {
                        continue;
                    }

                    ans.append(c);
                }

                return ans.toString();
            }

            static boolean isVowel(char c) {
                return c == 'a' || c == 'e' || c == 'i' ||
                       c == 'o' || c == 'u';
        
    }
}
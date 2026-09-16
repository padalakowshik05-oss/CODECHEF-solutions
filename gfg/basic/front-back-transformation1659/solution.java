class Solution {
    String transformString(String s) {
        StringBuilder ans = new StringBuilder();

                for (char c : s.toCharArray()) {
                    if (c >= 'a' && c <= 'z') {
                        ans.append((char) ('z' - (c - 'a')));
                    } else {
                        ans.append((char) ('Z' - (c - 'A')));
                    }
                }

                return ans.toString();
        
    }
}
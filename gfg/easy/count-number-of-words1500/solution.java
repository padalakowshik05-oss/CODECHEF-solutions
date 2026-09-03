class Solution {
    public int countWords(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (i == 0 || s.charAt(i - 1) == ' ' 
                          || s.charAt(i - 1) == '\t' 
                          || s.charAt(i - 1) == '\n') {
                    count++;
                }
            }
        }

        return count;
        
    }
}
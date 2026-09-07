class Solution {
    String firstRepChar(String s) {
        HashSet<Character> set = new HashSet<>();

        for (char ch : s.toCharArray()) {
            if (set.contains(ch)) {
                return String.valueOf(ch);
            }

            set.add(ch);
        }

        return "-1";
        
    }
}
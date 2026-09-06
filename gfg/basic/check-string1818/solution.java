class Solution {
    public boolean allCharactersSame(String s) {

        char first = s.charAt(0);

        for (int i = 1; i < s.length(); i++) {

            if (s.charAt(i) != first) {
                return false;
            }
        }

        return true;
    }
}
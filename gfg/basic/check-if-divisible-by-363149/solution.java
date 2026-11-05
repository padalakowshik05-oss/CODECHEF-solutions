class Solution {
    public boolean checkDivisibleBy36(String s) {
        int sum = 0;
        int lastTwo = Integer.parseInt(s.substring(Math.max(0, s.length() - 2)));

        for (int i = 0; i < s.length(); i++) {
            sum += s.charAt(i) - '0';
        }

        return sum % 9 == 0 && lastTwo % 4 == 0;
    }
}
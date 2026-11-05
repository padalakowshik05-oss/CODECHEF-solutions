class Solution {
    public long modify(long N) {
        String s = String.valueOf(N);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
                sb.append(s.charAt(i));
            }
        }

        return Long.parseLong(sb.toString());
    }
}
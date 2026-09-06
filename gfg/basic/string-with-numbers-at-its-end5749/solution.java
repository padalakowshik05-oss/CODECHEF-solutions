class Solution {
    int isSame(String s) {

        int i = s.length() - 1;
        while (i >= 0 && Character.isDigit(s.charAt(i))) {
            i--;
        }
        int len = i + 1;
        String num = s.substring(i + 1);
        int start = 0;

        while (start < num.length() - 1 && num.charAt(start) == '0') {
            start++;
        }

        num = num.substring(start);
        if (num.length() > String.valueOf(len).length()) {
            return 0;
        }
        String lenString = String.valueOf(len);

        if (num.equals(lenString)) {
            return 1;
        }

        return 0;
    }
}
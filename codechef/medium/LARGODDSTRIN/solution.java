public static String findLargestOddSubstring(String num) {
        int i;
        for (i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            if ((ch - '0') % 2 != 0) { 
                break;
            }
        }

        if (i == -1) {
            return "-1";
        } else {
            return num.substring(0, i + 1);
        }
    }


class Solution {
    public String altCase(String s) {
        StringBuilder ans = new StringBuilder();

                boolean firstLower = Character.isLowerCase(s.charAt(0));

                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);

                    if (firstLower) {
                        if (i % 2 == 0) {
                            ans.append(Character.toLowerCase(c));
                        } else {
                            ans.append(Character.toUpperCase(c));
                        }
                    } else {
                        if (i % 2 == 0) {
                            ans.append(Character.toUpperCase(c));
                        } else {
                            ans.append(Character.toLowerCase(c));
                        }
                    }
                }

                return ans.toString();
        
    }
}
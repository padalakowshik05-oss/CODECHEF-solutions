import java.util.*;

class Solution {
    public String reverse(String S) {

        Stack<Character> st = new Stack<>();
        for (char c : S.toCharArray()) {
            st.push(c);
        }

        StringBuilder ans = new StringBuilder();
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.toString();
    }
}
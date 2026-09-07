import java.util.*;

class Solution {
    public String firstNonRepeating(String s) {
        HashMap<Character, Integer> freq = new HashMap<>();
        Queue<Character> q = new LinkedList<>();
        StringBuilder ans = new StringBuilder();

        for (char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
            q.offer(ch);

            while (!q.isEmpty() && freq.get(q.peek()) > 1) {
                q.poll();
            }

            if (q.isEmpty()) {
                ans.append('#');
            } else {
                ans.append(q.peek());
            }
        }

        return ans.toString();
    }
}
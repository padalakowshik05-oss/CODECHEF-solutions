class Solution {

    static class Node {
        Node[] child = new Node[26];
        boolean end;
    }

    public String longestString(String[] words) {

        Node root = new Node();

        // Build Trie
        for (String word : words) {
            Node curr = root;

            for (char ch : word.toCharArray()) {
                int index = ch - 'a';

                if (curr.child[index] == null) {
                    curr.child[index] = new Node();
                }

                curr = curr.child[index];
            }

            curr.end = true;
        }

        String ans = "";

        // Check every word
        for (String word : words) {

            Node curr = root;
            boolean valid = true;

            for (char ch : word.toCharArray()) {
                curr = curr.child[ch - 'a'];

                // Every prefix must be a complete word
                if (!curr.end) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                if (word.length() > ans.length() ||
                    (word.length() == ans.length() &&
                     word.compareTo(ans) < 0)) {
                    ans = word;
                }
            }
        }

        return ans;
    }
}
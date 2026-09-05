# Find the longest string

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an array of strings  **words**  **[]**. Find the  **longest**  string in words[] such that  **every prefix**  of it is also present in the array words[]. 

 **Note:** If multiple strings have the same maximum length, return the  **lexicographically smallest one**.

 **Examples:** 

```
Input: words[] = ["p", "pr", "pro", "probl", "problem", "pros", "process", "processor"]
Output: pros
Explanation: "pros" is the longest word with all prefixes ("p", "pr", "pro", "pros") present in the array words[].
```

```
Input: words[] = ["ab", "a", "abc", "abd"]
Output: abc
Explanation: Both "abc" and "abd" has all the prefixes in words[]. Since, "abc" is lexicographically smaller than "abd", so the output is "abc".

```

 **Constraints:** 
1 ≤ words.length() ≤ 103
1 ≤ words[i].length ≤ 103

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T13:34:09.728Z  

```java
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
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/find-the-longest-string--170645/1)
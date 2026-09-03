# Count Sentences and Words

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**  representing a text, count the number of sentences and words in it.

- A sentence is a sequence of space-separated tokens ending with one or more of., !, or ?. If the text does not end with a sentence-ending punctuation mark, the last sequence of tokens is also considered a sentence.
- A word is a maximal sequence of alphabetic characters (a-z or A-Z).

Return an array [sentenceCount, wordCount].

 **Examples:** 

```
Input: s = "Sentences"
Output: [1, 1]
Explanation: There is one sentence and one word in the given text.
```

```
Input: s = "many??? Sentences are"
Output: [2, 3]
Explanation: The text contains two sentences: "many???", "Sentences are". 
The words are: "many", "Sentences", "are". Hence, the answer is [2, 3].
```

 **Constraints:** 
1 ≤ |s| ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-03T15:55:16.966Z  

```java
class Solution {
    public ArrayList<Integer> sentenceWord(String s) {
        ArrayList<Integer> ans = new ArrayList<>();

        int words = 0;
        int sentences = 0;
        boolean inWord = false;
        boolean hasWord = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isLetter(ch)) {
                if (!inWord) {
                    words++;
                    inWord = true;
                }
                hasWord = true;
            } else {
                inWord = false;
            }

            if ((ch == '.' || ch == '!' || ch == '?') && hasWord) {
                sentences++;
                hasWord = false;
            }
        }

        // Last sentence without punctuation
        if (hasWord) {
            sentences++;
        }

        ans.add(sentences);
        ans.add(words);

        return ans;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/counting-number-of-sentences-and-words-in-text3226/1)
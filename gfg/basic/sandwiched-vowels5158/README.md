# Remove Sandwiched Vowels

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given string  **s** containing only lowercase English alphabets, eliminate the vowels from the string that occur between two consonants (sandwiched between two immediately adjacent consonants). Return the new string.

 **Examples:** 

```
Input : s = "bab"
Output : bb
Explanation: 'a' is a vowel occuring between two consonants i.e. b. Hence the updated string eliminates a.
```

```
Input : s = "ceghij"
Output : cghj
Explanation: 'e' and 'i' are sandwitched vowels.
```

**Constraints:
**1 ≤ s.size() ≤ 106
'a' ≤ s[i] ≤ 'z'

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-12T15:20:16.891Z  

```java
class Solution {
    public String sandwichedVowel(String s) {
        StringBuilder ans = new StringBuilder();

                for (int i = 0; i < s.length(); i++) {
                    char c = s.charAt(i);

                    if (i > 0 && i < s.length() - 1 &&
                        isVowel(c) &&
                        !isVowel(s.charAt(i - 1)) &&
                        !isVowel(s.charAt(i + 1))) {
                        continue;
                    }

                    ans.append(c);
                }

                return ans.toString();
            }

            static boolean isVowel(char c) {
                return c == 'a' || c == 'e' || c == 'i' ||
                       c == 'o' || c == 'u';
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/sandwiched-vowels5158/1)
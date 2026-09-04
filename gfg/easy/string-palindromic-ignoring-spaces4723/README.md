# Palindrome Sentence

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a single string  **s**, the task is to check if it is a  **palindrome sentence**  or not.
A palindrome sentence is a sequence of characters, such as word, phrase, or series of symbols that reads the  **same**  backward as forward after converting all  **uppercase** letters to **lowercase** and  **removing**  all  **non-alphanumeric**  characters (including spaces and punctuation).

 **Examples:** 

```
Input: s = "Too hot to hoot"
Output: true
Explanation: If we remove all non-alphanumeric characters and convert all uppercase letters to lowercase, string s will become "toohottohoot" which is a palindrome.
```

```
Input: s = "Abc 012..## 10cbA"
Output: true
Explanation: If we remove all non-alphanumeric characters and convert all uppercase letters to lowercase, string s will become "abc01210cba" which is a palindrome.
```

```
Input: s = "ABC $. def01ASDF"
Output: false
Explanation: The processed string becomes "abcdef01asdf", which is not a palindrome.
```

 **Constraints:** 
1 ≤ s.length() ≤ 106

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-04T17:48:10.136Z  

```java
class Solution {
    public boolean isPalinSent(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if (Character.toLowerCase(s.charAt(i)) !=
                Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/string-palindromic-ignoring-spaces4723/1)
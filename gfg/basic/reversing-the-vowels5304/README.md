# Reverse Vowels

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given a string consisting of lowercase English alphabets, reverse only the vowels present in it and print the resulting string.

 **Examples:** 

```
Input: s = "geeksforgeeks"
Output: "geeksforgeeks"
Explanation: The vowels are: e, e, o, e, e. Reverse of these is also e, e, o, e, e.

```

```
Input: s = "practice"
Output: "prectica"
Explanation: The vowels are a, i, e. Reverse of these is e, i, a.

```

```
Input: s = "bcdfg"
Output: "bcdfg"
Explanation: There are no vowels in s.
```

 **Constraints:** 
1<=|s|<=105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-05T13:06:04.019Z  

```java
class Solution {
    public String modify(String s) {
        char[] arr = s.toCharArray();

        for (int i = 0, j = arr.length - 1; i < j; ) {

            while (i < j && !isVowel(arr[i])) {
                i++;
            }

            while (i < j && !isVowel(arr[j])) {
                j--;
            }

            if (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
        }

        return new String(arr);
    }

    private boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u';
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reversing-the-vowels5304/1)